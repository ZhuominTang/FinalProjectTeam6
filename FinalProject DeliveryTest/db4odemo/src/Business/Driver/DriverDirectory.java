/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Driver;

import java.util.ArrayList;

/**
 *
 * @author 加藤鹰
 */
public class DriverDirectory {
    private ArrayList< Driver>  driverDirectory;
    
    public  DriverDirectory() {
        
         driverDirectory = new ArrayList();
        
    }

    public ArrayList<Driver> getDriverDirectory() {
        return driverDirectory;
    }

    public void setDriverDirectory(ArrayList<Driver> DriverDirectory) {
        this.driverDirectory = DriverDirectory;
    }
    
   
    
    public  Driver newDriver(String name,String phoneNumber, String Address){
         Driver driver = new  Driver(name, phoneNumber,Address);
         driverDirectory.add(driver);
        return driver;
    }
    
    public void removeDriver( Driver  driver){
         driverDirectory.remove(driver);
    }
    
    public  Driver getDriver(String name){
        for( Driver driver:  driverDirectory){
            if( driver.getName().equalsIgnoreCase(name)){
                return  driver;
            }
        }
        return null;
    
    }
}
