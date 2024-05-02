/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.seminar3.model;

/**
 * An item object, containing information about the item.
 *
 * @author nilse
 */
public class Item {
    private int itemAmount = 0;
    private int itemId;
    private double itemPrice;
    private String itemName;
    private String itemDescription;
    private double valueAddedTax;
    
    /**
     * Creates an item objext
     * @param amount The original amount of said item;
     * @param itemId The item Id
     * @param itemName The name of the item
     * @param itemDescription A simple description of the item
     * @param valueAddedTax The VAT
     * @param itemPrice The cost of the item
     */
    
    public Item(int amount, int itemId, String itemName, String itemDescription, double valueAddedTax, double itemPrice){
        this.itemAmount = amount;
        this.itemPrice = itemPrice;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.valueAddedTax = valueAddedTax;
    }
    
    public int getItemAmount(){
        return this.itemAmount;
    }
    
    public int getItemId(){
        return this.itemId;
    }
    
    public double getVAT(){
        return this.valueAddedTax;
    }
    
    public String getItemName(){
        return this.itemName;
    }
    
    public String getItemDescription(){
        return this.itemDescription;
    }
    
    public double getPrice(){
        return this.itemPrice;
    }
    
    public void increaseAmount(int increase) {
        this.itemAmount += increase;
    }
    
    
}
