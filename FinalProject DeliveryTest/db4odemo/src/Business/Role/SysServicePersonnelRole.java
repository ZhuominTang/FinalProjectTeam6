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
import UI.SysServicePersonnel.SysServicePersonnelJPanel;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author tzm
 */
public class SysServicePersonnelRole extends Role {

    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, JFrame frame, DriverDirectory driverDirectory, DistributionCenterDirectory distributionCenterDirectory, DeliveryManDirectory deliveryManDirectory) {
       return new SysServicePersonnelJPanel(userProcessContainer, organization, account, system, frame);
    }
}
