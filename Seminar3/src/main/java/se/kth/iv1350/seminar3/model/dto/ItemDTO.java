/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.seminar3.model.dto;
import se.kth.iv1350.seminar3.model.Item;

/**
 * A DTO class used to transfer Item information.
 * 
 * @author nilse
 */
public class ItemDTO {
    
    private double valueAddedTax;
    private double itemPrice;
    private int itemId;
    private String itemName;
    private int itemAmount;
    private String itemDescription;
    
    /**
     * Creates an ItemDTO based on an item.
     * 
     * @param item An Item object the DTO is to be based on.
     */
    public ItemDTO(Item item){
        this.itemId = item.getItemId();
        this.itemName = item.getItemName();
        this.itemPrice = item.getPrice();
        this.itemAmount = item.getItemAmount();
        this.itemDescription = item.getItemDescription();
        this.valueAddedTax = item.getVAT();
    }
    
    
    /**
     * Gets the amount of the item.
     * 
     * @return An int representing the number of said item.
     */
    public int getItemAmount(){
        return this.itemAmount;
    }
    
    /**
     * Gets the items id
     * 
     * @return An int representing the items id.
     */
    public int getItemId(){
        return this.itemId;
    }
    
    
    /**
     * Gets the VAT in a percentage factor form.
     * 
     * @return A double representing the VAT in a percentage factor form.
     */
    public double getVAT(){
        return this.valueAddedTax;
    }
    
    /**
     * Gets the items name.
     * 
     * @return A string containing the items name.
     */
    public String getItemName(){
        return this.itemName;
    }
    
    
    /**
     * Gets a description of the item.
     * 
     * @return A string containing the items description.
     */
    public String getItemDescription(){
        return this.itemDescription;
    }
    
    /**
     * Gets the items price.
     * 
     * @return An int representing the cost of one item in SEK.
     */
    public double getPrice(){
        return this.itemPrice;
    }
    
}
