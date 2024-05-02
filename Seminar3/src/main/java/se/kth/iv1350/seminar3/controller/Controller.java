/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.seminar3.controller;
import se.kth.iv1350.seminar3.model.Sale;
import se.kth.iv1350.seminar3.model.Item;
import se.kth.iv1350.seminar3.integration.ExternalInventorySystemAccessPoint;
import se.kth.iv1350.seminar3.model.dto.*;
import java.util.List;
import se.kth.iv1350.seminar3.integration.ExternalAccountingSystemAccessPoint;

/**
 * A controller class.
 * @author nilse
 */
public class Controller {
    private Sale sale; //might be better for it to be an list of sale objects.
    private ExternalInventorySystemAccessPoint externInv = new ExternalInventorySystemAccessPoint();
    private ExternalAccountingSystemAccessPoint accounting = new ExternalAccountingSystemAccessPoint();
    
    /**
     * Starts a new sale.
     */
    public void startSale(){
        this.sale = new Sale();
    }
    
    /**
     * Ends the sale.
     * 
     * @return A message which says the sale has ended and the total cost of the sale.
     */
    public String endSale(){
        return sale.endSale();
    }
    
    
    /**
     * A simple payment processing method.
     * 
     * @param money The amount paid in SEK.
     * 
     * @return A string representing the receipt and the change
     */
    public String payment(int money){
        String printReceipt = sale.payment(money);
        List<ItemDTO> itemList = sale.getItemList();
        ReceiptDTO saleInfo = sale.getSaleInfo();
        accounting.updateAccounting(saleInfo);
        externInv.updateInventory(itemList);
        return printReceipt;
    }
    
    /**
     * Adds an item to the sale.
     * 
     * @param itemId The id of the item.
     * 
     * @return A string containing information about the item and current total of the sale.
     */
    public String addItem(int itemId){
        Item item = externInv.retrieveItem(itemId);
        return sale.addItemToReceipt(item, 1);
    }
    
    /**
     * Adds items to the sale.
     * 
     * @param itemId The id of the item.
     * @param amount The amount of said item.
     * 
     * @return A string containing information about the item and current total of the sale.
     */
    public String addItem(int itemId, int amount){
        Item item = externInv.retrieveItem(itemId);
        return sale.addItemToReceipt(item, amount);
    }
}
