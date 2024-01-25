package states;

import machine.*;

public class SelectionState implements State {

    SelectionState(){
        System.out.println("Machine is in SelectionState");
    }

    @Override
    public void clickOnInsertButton(VendingMachine machine) throws Exception {
        throw new Exception("Insert button cannot be clicked as it is in selection state");
    }

    @Override
    public void insertCoins(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Cannot insert coins in Selection state");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void selectProduct(VendingMachine machine, int codeNumber) throws Exception {
        ItemShelf[] shelves = machine.getInventory().getItemShelves();

        int totalMoney = getTotalMoney(machine);

        for (ItemShelf shelf: shelves){
            if (shelf.getCode()==codeNumber){
                if (!shelf.isSoldOut() && totalMoney>=shelf.getItem().getPrice()){
                    shelf.setSoldOut(true);
                    returnChange(totalMoney-shelf.getItem().getPrice());
                    dispenseProduct(machine);
                    updateInventory(machine, codeNumber);
                }
            }
        }

    }

    private int getTotalMoney(VendingMachine machine) {
        int totalMoney = 0;
        for (Coin coin: machine.getCoinList()){
            totalMoney += coin.value;
        }
        return totalMoney;
    }

    private void returnChange(int returnChange) {
        if (returnChange>0)
            System.out.println("Amount "+returnChange+" refunded in the cash tray please collect it");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) throws Exception {
        System.out.println("Product dispensed in the product tray, please collect it");
        machine.setCurrentState(new IdleState());
    }

    private void updateInventory(VendingMachine machine, int codeNumber) {
        Inventory inventory = machine.getInventory();
        inventory.getItemShelves();
        for (ItemShelf itemShelf : inventory.getItemShelves()) {
            if (itemShelf.getCode()==codeNumber){
                itemShelf.setSoldOut(true);
                break;
            }
        }
    }

    @Override
    public void clickOnCancel(VendingMachine machine) throws Exception {
        System.out.println("Refunded money "+getTotalMoney(machine));
    }
}
