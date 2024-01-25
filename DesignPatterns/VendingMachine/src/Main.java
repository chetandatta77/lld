import machine.Coin;
import machine.Inventory;
import machine.ItemShelf;
import machine.VendingMachine;
import states.State;

public class Main {

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        displayVendingMachine(machine);
        State currentState = machine.getCurrentState();
        try {
            currentState.clickOnInsertButton(machine);
            currentState = machine.getCurrentState();

            currentState.insertCoins(machine, Coin.DIME);
            currentState.insertCoins(machine,Coin.QUARTER);

            currentState.clickOnSelectProductButton(machine);
            currentState = machine.getCurrentState();
            currentState.selectProduct(machine, 105);

            displayVendingMachine(machine);

            currentState = machine.getCurrentState();
            currentState.clickOnCancel(machine);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static void displayVendingMachine(VendingMachine machine) {
        Inventory inventory = machine.getInventory();
        System.out.println("-------------------------");
        for (ItemShelf shelf:inventory.getItemShelves()){
            System.out.println("Item is "+shelf.getItem().getItemType()+ " and code is "+shelf.getCode()+" and price is "+shelf.getItem().getPrice()+" and available "+ !shelf.isSoldOut());
        }
        System.out.println("-------------------------");
    }
}
