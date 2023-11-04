package VendingStates.Impl;

import VendingStates.State;
import machine.Coin;
import machine.Item;
import machine.VendingMachine;

import java.util.List;

public class DispenseState implements State {

    public DispenseState(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Currently vending machine is in DispenseState");
        dispenseProduct(machine,codeNumber);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Insert coin button cannot clicked on Dispense state");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("product selection button cannot be clicked in Dispense State");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Cannot insert Coins in Dispense State");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Cannot Select product in Dispense state");
    }

    @Override
    public void getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Cannot get Change in Dispense State");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("Refund cannot be happen in Dispense State");
    }


    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory cannot be updated in Dispense State");
    }
}
