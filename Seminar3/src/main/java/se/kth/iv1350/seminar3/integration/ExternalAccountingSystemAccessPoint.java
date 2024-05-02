/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.seminar3.integration;

import se.kth.iv1350.seminar3.model.dto.ReceiptDTO;

/**
 * This class is a handler class that represents a connection 
 * to the External Accounting System.
 * 
 * 
 * @author nilse
 */
public class ExternalAccountingSystemAccessPoint {
    public void updateAccounting(ReceiptDTO receipt){
        System.out.println("Sale info sent to accounting system");
    }
}
