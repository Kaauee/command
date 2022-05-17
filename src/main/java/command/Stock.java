/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author alunopb
 */
public class Stock {
    
    private String name = "ABC";
    private int quantity = 10;
            
    public void buy(){
        System.out.println("Stock [ Name: " + name + 
                ", Quantity: " + quantity + "] bought");
    }
    
    public void sell(){
        System.out.println("Stock [ Name: " + name + 
                ", Quantity: " + quantity + "] sold");
    }
}
