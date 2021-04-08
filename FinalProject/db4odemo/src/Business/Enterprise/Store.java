/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author tzm
 */
public class Store extends Enterprise {

    private ItemDirectory itemDirectory;
    String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    private String phoneNumber;

    public Store(String name) {
        super(name, Enterprise.EnterpriseType.Store);
        itemDirectory = new ItemDirectory();
    }

    @Override

    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ItemDirectory getItemDirectory() {
        return itemDirectory;
    }

    public void setItemDirectory(ItemDirectory itemDirectory) {
        this.itemDirectory = itemDirectory;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
