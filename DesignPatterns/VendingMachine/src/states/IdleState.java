package states;

import machine.Coin;
import machine.VendingMachine;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Vending machine is in Idle state");
    }

    @Override
    public void clickOnInsertButton(VendingMachine machine) throws Exception {
        System.out.println("Insert button clicked");
        machine.setCurrentState(new HasMoneyState());
    }

    @Override
    public void insertCoins(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Cannot insert coins in the idle state");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception {
        throw new Exception("Machine is in idle state hence product selection button not active");
    }

    @Override
    public void selectProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Machine is in idle state hence selection dial pad is not active");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) throws Exception {
        throw new Exception("Machine is in idle state hence cannot dispense any products");
    }

    @Override
    public void clickOnCancel(VendingMachine machine) throws Exception {
        throw new Exception("Machine already in idle state hence cancel button is not active");
    }
}
