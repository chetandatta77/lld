package VendingStates.Impl;

import VendingStates.State;
import machine.Coin;
import machine.Item;
import machine.VendingMachine;

import java.util.List;

public class SelectionState implements State {
    public SelectionState() {
        System.out.println("Currently Vending machine is in SelectionState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("You cannot click on insert coin button in Selection state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You cannot insert Coin in Selection State");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        //1. Get item of this codeNumber
        Item item = machine.getInventory().getItem(codeNumber);

        //2. Total amount paid by user
        int paidByUser = 0;
        for (Coin coin: machine.getCoinList()){
            paidByUser = paidByUser + coin.value;
        }

        //3. Compare product price and amoutn paid by user
        if (paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: "+ item.getPrice()+ "and you paid: "+ paidByUser);
            refundFullMoney(machine);
            throw new Exception("insufficient amount");
        }
        else if(paidByUser >= item.getPrice()){
            if (paidByUser> item.getPrice()){
                getChange(paidByUser-item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine,codeNumber));
        }

    }

    @Override
    public void getChange(int returnChangeMoney) throws Exception {
        System.out.println("Returned the change in the coin Dispense Tray: "+ returnChangeMoney);
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product cannot be dispensed selection state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }


    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory cannot be updated in Selection State");
    }
}
