/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DistributionCenter;

import java.util.ArrayList;

/**
 *
 * @author 加藤鹰
 */
public class DistributionCenterDirectory {
    private ArrayList<DistributionCenter>  distributionCenterDirectory;

    public DistributionCenterDirectory() {
        distributionCenterDirectory = new ArrayList();
         
    }

    public ArrayList<DistributionCenter> getDistributionCenterDirectory() {
        return distributionCenterDirectory;
    }

    public void setDistributionCenterDirectory(ArrayList<DistributionCenter> DistributionCenterDirectory) {
        this.distributionCenterDirectory = DistributionCenterDirectory;
    }
    
    public DistributionCenter newDistributionCenter(String name, String address,  String phoneNumber) {
       DistributionCenter distributionCenter = new DistributionCenter(name, address,  phoneNumber);
        distributionCenterDirectory.add(distributionCenter);
        return distributionCenter;
    }
    
    public void removeDistributionCenter(DistributionCenter distributionCenter){
        distributionCenterDirectory.remove(distributionCenter);
    }
    
    public DistributionCenter getDistributionCenter(String name) {
        for(DistributionCenter r : distributionCenterDirectory) {
            if(r.getName().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
}
