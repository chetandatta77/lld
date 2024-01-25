package states;

import machine.Coin;
import machine.VendingMachine;

public class HasMoneyState implements State {

    HasMoneyState(){
        System.out.println("Machine is in HasMoneyState");
    }

    @Override
    public void clickOnInsertButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoins(VendingMachine machine, Coin coin) throws Exception {
        machine.getCoinList().add(coin);
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception {
        machine.setCurrentState(new SelectionState());
    }

    @Override
    public void selectProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Click on select button before selecting the product");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) throws Exception {
        throw new Exception("Cannot dispense product");
    }

    @Override
    public void clickOnCancel(VendingMachine machine) throws Exception {
        System.out.println("Full money refunded");
    }
}
