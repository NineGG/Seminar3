/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package se.kth.iv1350.seminar3.view;

import se.kth.iv1350.seminar3.controller.Controller;

/**
 *
 * @author nilse
 */
public class View {
    private Controller contr;
    
    public View(Controller contr){
        this.contr = contr;
        fakeCustomer();
        
        
    }
    
    /**
     * Fake customer interaction.
     */
    private void fakeCustomer(){
        contr.startSale();
        System.out.println(contr.addItem(423));
        System.out.println(contr.addItem(231,3));
        System.out.println(contr.endSale());
        System.out.println(contr.payment(500));
    }
    
}
