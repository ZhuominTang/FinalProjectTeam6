/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author 加藤鹰
 */
public class DeliveryManDirectory {
     private ArrayList<DeliveryMan> deliveryManDirectory;
     
      public DeliveryManDirectory() {
        deliveryManDirectory = new ArrayList();
    }

      public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    
    
    public DeliveryMan newDeliveryMan(String name, String address, String phoneNumber) {
        DeliveryMan deliveryMan = new DeliveryMan(name, address, phoneNumber);
        deliveryManDirectory.add(deliveryMan);
        return deliveryMan;
    }
    
    public void removeDeliveryMan(DeliveryMan deliveryMan) {
        deliveryManDirectory.remove(deliveryMan);
    }
    
    public DeliveryMan getDeliveryMan(String name){
        for(DeliveryMan DeliveryMan: deliveryManDirectory){
            if(DeliveryMan.getName().equalsIgnoreCase(name)){
                return DeliveryMan;
            }
        }
        return null;
    
    }
}
