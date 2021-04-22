/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DeliveryAgent;

import Business.Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Role.Role;
import javax.swing.JPanel;
import Business.Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;

import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.StoreReceptionistOrganization;

import Business.Role.Role;
import Business.Role.Role.RoleType;
import Business.Role.StoreDistributionPersonnelRole;
import Business.Role.StoreReceptionistRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 加藤鹰
 */
public class CreateDeliveryManJPanel extends javax.swing.JPanel {

     private EcoSystem system;
    private Enterprise en;
    private JPanel panel;
    private JPanel workPanel;
    private Role role;
        private EcoSystem ecoSystem;
   
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    /**
     * Creates new form CreateDeliveryManJPanel
     */
    public CreateDeliveryManJPanel() {
        initComponents();
    }

    CreateDeliveryManJPanel(EcoSystem system, DeliveryAgentJPanel aThis, JPanel workPanel, Enterprise enterprise) {
        initComponents();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        jLabelphoneNumber = new javax.swing.JLabel();
        AddressjLabel4 = new javax.swing.JLabel();
        NamejTextField1 = new javax.swing.JTextField();
        PhoneNumberjTextField2 = new javax.swing.JTextField();
        AddressjTextField3 = new javax.swing.JTextField();
        UserNamejTextField3 = new javax.swing.JTextField();
        PassWordjTextField4 = new javax.swing.JTextField();
        jLabelphoneNumber1 = new javax.swing.JLabel();
        AddressjLabel5 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        namejLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create DeliveryMan Account");

        cancelButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabelphoneNumber.setText("PhoneNumber");

        AddressjLabel4.setText("Adddress");

        NamejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamejTextField1ActionPerformed(evt);
            }
        });

        PhoneNumberjTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberjTextField2ActionPerformed(evt);
            }
        });

        AddressjTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressjTextField3ActionPerformed(evt);
            }
        });

        UserNamejTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNamejTextField3ActionPerformed(evt);
            }
        });

        jLabelphoneNumber1.setText("UserName");

        AddressjLabel5.setText("PassWord");

        btnCreate.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        namejLabel2.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(namejLabel2))
                                .addComponent(AddressjLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelphoneNumber, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(72, 72, 72)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NamejTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(PhoneNumberjTextField2))
                                .addComponent(AddressjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelphoneNumber1)
                                .addComponent(AddressjLabel5))
                            .addGap(72, 72, 72)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(UserNamejTextField3)
                                .addComponent(PassWordjTextField4))))
                    .addContainerGap(138, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(283, 283, 283)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(namejLabel2)
                        .addComponent(NamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PhoneNumberjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelphoneNumber))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddressjLabel4)
                        .addComponent(AddressjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UserNamejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelphoneNumber1))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PassWordjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddressjLabel5))
                    .addContainerGap(114, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.workPanel.remove(this);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void PhoneNumberjTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberjTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberjTextField2ActionPerformed

    private void AddressjTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressjTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressjTextField3ActionPerformed

    private void UserNamejTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNamejTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNamejTextField3ActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnCreateActionPerformed

    private void NamejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamejTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressjLabel4;
    private javax.swing.JLabel AddressjLabel5;
    private javax.swing.JTextField AddressjTextField3;
    private javax.swing.JTextField NamejTextField1;
    private javax.swing.JTextField PassWordjTextField4;
    private javax.swing.JTextField PhoneNumberjTextField2;
    private javax.swing.JTextField UserNamejTextField3;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelphoneNumber;
    private javax.swing.JLabel jLabelphoneNumber1;
    private javax.swing.JLabel namejLabel2;
    // End of variables declaration//GEN-END:variables
}
