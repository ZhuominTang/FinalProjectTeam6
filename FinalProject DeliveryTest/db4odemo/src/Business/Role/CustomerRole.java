/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Business.EcoSystem;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.DistributionCenter.DistributionCenterDirectory;
import Business.Driver.DriverDirectory;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;



import Business.UserAccount.UserAccount;
import UI.Customer.CustomerJPanel;
import javax.swing.JFrame;

import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

   

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, JFrame frame, DriverDirectory driverDirectory, DistributionCenterDirectory distributionCenterDirectory, DeliveryManDirectory deliveryManDirectory) {
        return new CustomerJPanel(userProcessContainer,system,account,enterprise,organization);//To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
