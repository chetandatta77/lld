package VendingStates.Impl;

import VendingStates.State;
import machine.Coin;
import machine.Item;
import machine.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {
    public IdleState() {
        System.out.println("Currently Vending Machine is in IdleState");
    }

    public IdleState(VendingMachine machine) {
        System.out.println("Currently Vending Machine is in IdleState");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void getChange(int returnChangeMoney) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getInventory().addItem(item, codeNumber);
    }
}
