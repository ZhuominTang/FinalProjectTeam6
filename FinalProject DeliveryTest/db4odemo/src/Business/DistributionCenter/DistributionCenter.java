/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DistributionCenter;

import Business.Business.Person;

/**
 *
 * @author 加藤鹰
 */
public class DistributionCenter extends Person{
    private String Name;
    private String address;
    private String phoneNumber;

   

    public DistributionCenter(String Name, String address, String phoneNumber) {
        this.Name = Name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    

    @Override
    public String toString() {
         return Name;
    }
    
    
   
}
