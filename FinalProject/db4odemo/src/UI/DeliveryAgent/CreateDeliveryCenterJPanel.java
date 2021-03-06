/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DeliveryAgent;

import Business.Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Employee.Employee;

import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Item;
import Business.Enterprise.Store;
import Business.Organization.DistributionCentersOrganization;
import Business.Organization.Organization;
import Business.Role.DistributionCentersAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 加藤鹰
 */
public class CreateDeliveryCenterJPanel extends javax.swing.JPanel {

    private EcoSystem system;
    private Enterprise enterprise;
    private JPanel dajp;
    private JPanel createPanel;

    /**
     * Creates new form CreateDeliveryCenterJPanel
     */
    public CreateDeliveryCenterJPanel() {
        initComponents();
    }

    CreateDeliveryCenterJPanel(EcoSystem system, DeliveryAgentJPanel dajp, JPanel createPanel, Enterprise enterprise) {
        initComponents();
        this.system = system;
        this.dajp = dajp;
        this.createPanel = createPanel;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelphoneNumber4 = new javax.swing.JLabel();
        AddressjLabel8 = new javax.swing.JLabel();
        NamejTextField = new javax.swing.JTextField();
        PhoneNumberjTextField = new javax.swing.JTextField();
        AddressjTextField = new javax.swing.JTextField();
        UserNamejTextField = new javax.swing.JTextField();
        TitlejLabel1 = new javax.swing.JLabel();
        jLabelphoneNumber5 = new javax.swing.JLabel();
        AddressjLabel9 = new javax.swing.JLabel();
        namejLabel4 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        passwordJPasswordField = new javax.swing.JPasswordField();
        btnCreate = new javax.swing.JButton();

        jLabelphoneNumber4.setText("PhoneNumber");

        AddressjLabel8.setText("Address");

        PhoneNumberjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberjTextFieldActionPerformed(evt);
            }
        });

        AddressjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressjTextFieldActionPerformed(evt);
            }
        });

        UserNamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNamejTextFieldActionPerformed(evt);
            }
        });

        TitlejLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        TitlejLabel1.setText("Create DistributionCenter Account");

        jLabelphoneNumber5.setText("UserName");

        AddressjLabel9.setText("PassWord");

        namejLabel4.setText("Name");

        cancelButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        passwordJPasswordField.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N

        btnCreate.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addComponent(namejLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AddressjLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelphoneNumber4, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NamejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                        .addComponent(PhoneNumberjTextField))
                                    .addComponent(AddressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCreate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelphoneNumber5)
                                            .addComponent(AddressjLabel9))
                                        .addGap(72, 72, 72)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(UserNamejTextField)
                                            .addComponent(passwordJPasswordField))))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(TitlejLabel1))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitlejLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namejLabel4)
                    .addComponent(NamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelphoneNumber4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressjLabel8)
                    .addComponent(AddressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelphoneNumber5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressjLabel9)
                    .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(btnCreate))
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String DeliveryCenterName = NamejTextField.getText();
        String phoneNumber = PhoneNumberjTextField.getText();
        String address = AddressjTextField.getText();
        String userName = UserNamejTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        if (DeliveryCenterName.trim().equals("") || phoneNumber.trim().equals("") || address.trim().equals("") || userName.trim().equals("")
                || password.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }
         try{
          long l= Long.parseLong(phoneNumber);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Incorrect phone number input format!");
            return;
        }
        Boolean used = false;
        for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
            if (userName.equals(ua.getUsername())) {

                used = true;
                break;
            }

        }
        if (used == false) {
            Label1:
            for (Enterprise en : system.getEnterpriseDirectory().getEnterpriseList()) {

                for (Organization org : en.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        if (userName.equals(ua.getUsername())) {

                            used = true;
                            break Label1;

                        }

                    }
                }

            }
        }
        if (used == true) {
            JOptionPane.showMessageDialog(this, "UserName has been used", "Warning", JOptionPane.WARNING_MESSAGE);
            return;

        }
        Organization org = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.DistributionCenters);
        DistributionCentersOrganization dc = (DistributionCentersOrganization)org;
        dc.setName(DeliveryCenterName);
        dc.setAddress(address);
        dc.setPhoneNumber(phoneNumber);
        dc.getUserAccountDirectory().createUserAccount(userName, password, new Employee(), new DistributionCentersAdminRole());
         DB4OUtil.getInstance().storeSystem(system);

        JOptionPane.showMessageDialog(null, "DistributionCenter Created");
          DB4OUtil.getInstance().storeSystem(system);
                        DeliveryAgentJPanel p = (DeliveryAgentJPanel) dajp;
                        p.populateDeliveryCenterTable() ;
                        this.createPanel.remove(this);
                        CardLayout layout = (CardLayout) this.createPanel.getLayout();
                        layout.previous(this.createPanel);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void PhoneNumberjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberjTextFieldActionPerformed

    private void AddressjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressjTextFieldActionPerformed

    private void UserNamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNamejTextFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.createPanel.remove(this);
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressjLabel8;
    private javax.swing.JLabel AddressjLabel9;
    private javax.swing.JTextField AddressjTextField;
    private javax.swing.JTextField NamejTextField;
    private javax.swing.JTextField PhoneNumberjTextField;
    private javax.swing.JLabel TitlejLabel1;
    private javax.swing.JTextField UserNamejTextField;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabelphoneNumber4;
    private javax.swing.JLabel jLabelphoneNumber5;
    private javax.swing.JLabel namejLabel4;
    private javax.swing.JPasswordField passwordJPasswordField;
    // End of variables declaration//GEN-END:variables
}
