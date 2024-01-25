package states;

import machine.Coin;
import machine.VendingMachine;

public interface State {

    public void clickOnInsertButton(VendingMachine machine) throws Exception;

    public void insertCoins(VendingMachine machine, Coin coin) throws Exception;

    public void clickOnSelectProductButton(VendingMachine machine) throws Exception;

    public void selectProduct(VendingMachine machine, int codeNumber) throws Exception;

    public void dispenseProduct(VendingMachine machine) throws Exception;

    public void clickOnCancel(VendingMachine machine) throws Exception;

}
