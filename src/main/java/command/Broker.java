/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    
    private List<Order> orderList = new ArrayList<Order>();
    
    public void takeOrder(Order order){
    orderList.add(order);
    }
    
    public void placeOrders(){
    
        for (Order order : orderList) {
            order.execute();
        }
    orderList.clear();
    }
    
    
    
    
    
    
}
