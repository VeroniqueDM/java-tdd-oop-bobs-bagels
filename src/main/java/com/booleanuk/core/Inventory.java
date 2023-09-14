package com.booleanuk.core;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> inventoryList;

    public Inventory() {
        this.inventoryList = new ArrayList<>();
        this.inventoryList.add(new Bagel("BGLO", 0.49, "Bagel", "Onion"));
        this.inventoryList.add(new Bagel("BGLP",	0.39,	"Bagel",	"Plain"));
        this.inventoryList.add(new Bagel("BGLE", 0.49, "Bagel", "Everything"));
        this.inventoryList.add(new Bagel("BGLS", 0.49, "Bagel", "Sesame"));
        // put them in file
        // initialize with for loop reading each line and splitting it - in main
        // do a dependency injection in Basket
    }

    public ArrayList<Item> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<Item> inventoryList) {
        this.inventoryList = inventoryList;
    }
    // initialize with {static ...}?? here or in Basket?
}
