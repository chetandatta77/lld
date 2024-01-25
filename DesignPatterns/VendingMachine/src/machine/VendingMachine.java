package machine;

import states.IdleState;
import states.State;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private Inventory inventory;
    private List<Coin> coinList;
    private State currentState;

    public VendingMachine() {
        coinList = new ArrayList<>();
        currentState = new IdleState();
        initializeInventory();
    }

    //initialization can be moved out of this object
    private void initializeInventory() {
        int codeNumber = 101;
        ItemShelf[] itemShelves = new ItemShelf[9];
        for (int i=0; i<9; i++){
            ItemShelf itemShelf = new ItemShelf();
            Item item = new Item();
            item.setItemType(ItemType.BISCUITS);
            item.setPrice(124-codeNumber);
            itemShelf.setItem(item);
            itemShelf.setSoldOut(false);
            itemShelf.setCode(codeNumber);
            itemShelves[i] = itemShelf;
            codeNumber+=1;
            itemShelves[i] = itemShelf;
        }
        inventory = new Inventory();
        inventory.setItemShelves(itemShelves);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
