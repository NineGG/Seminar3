/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.seminar3.integration;
import se.kth.iv1350.seminar3.model.Item;
import se.kth.iv1350.seminar3.model.dto.*;
import java.util.List;

/**
 * This class is a handler class that represents a connection 
 * to the External inventory System.
 *
 * @author nilse
 */
public class ExternalInventorySystemAccessPoint {
    String itemDescription;
    String itemName;
    double price;
    double valueAddedTax;
    
    /**
     * requests an item from the ExternalInventorySystem(fake) based on the itemId provided.
     * 
     * @param itemId The id of the item requested.
     * @return The item object.
     */
    public Item retrieveItem(int itemId){
        if (itemId == 423){
            itemDescription = "Whole Milk, 500ml, 3% Fat Content";
            itemName = "Milk\t";
            price = 25.50;
            valueAddedTax = 0.12;
        } else if (itemId == 231){
            itemDescription = "500g, Gluten Free";
            itemName = "Bread\t";
            price = 54.50;
            valueAddedTax = 0.12;
        }
        
        return new Item(0, itemId, itemName, itemDescription, valueAddedTax, price);
    }
    
    /**
     * Updates the ExternalInventorySystem based on the items provided.
     * 
     * @param itemList List of Item objects.
     */
    public void updateInventory(List<ItemDTO> itemList){
        for(ItemDTO item : itemList){
            System.out.println("Informed external inventory system to decrease inventory "
                    + "quantity of item " + item.getItemId() + " by " + item.getItemAmount() + " units.");
        }
    }

    
}
