/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Business;


import Business.DeliveryMan.DeliveryManDirectory;
import Business.DistributionCenter.DistributionCenterDirectory;
import Business.Driver.DriverDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;

import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author tzm
 */
public class EcoSystem extends Enterprise {

    private static EcoSystem business;
    private EnterpriseDirectory enterpriseDirectory;
    
     private DriverDirectory driverDirectory;
    private DistributionCenterDirectory distributionCenterDirectory;
    private DeliveryManDirectory deliveryManDirectory;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null,Enterprise.EnterpriseType.System);
        this.enterpriseDirectory = new EnterpriseDirectory();

    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public boolean checkIfUserIsUnique(String userName) {
        //
        return false;
    }

    public DriverDirectory getDriverDirectory() {
        return driverDirectory;
    }

    public void setDriverDirectory(DriverDirectory driverDirectory) {
        this.driverDirectory = driverDirectory;
    }

    public DistributionCenterDirectory getDistributionCenterDirectory() {
        return distributionCenterDirectory;
    }

    public void setDistributionCenterDirectory(DistributionCenterDirectory distributionCenterDirectory) {
        this.distributionCenterDirectory = distributionCenterDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    
}
