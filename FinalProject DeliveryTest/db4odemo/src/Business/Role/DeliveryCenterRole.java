/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 加藤鹰
 */
public class DeliveryCenterRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, JFrame frame, DriverDirectory driverDirectory, DistributionCenterDirectory distributionCenterDirectory, DeliveryManDirectory deliveryManDirectory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
