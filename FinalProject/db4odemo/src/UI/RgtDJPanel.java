/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Business.Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DeliveryAgentRegisterRequest;
import Business.WorkQueue.Status;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tzm
 */
public class RgtDJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RgtDJPanel
     */
    private EcoSystem system;
    private JPanel loginJPanel;

    /**
     * Creates new form LoginJPanel
     */
    public RgtDJPanel(EcoSystem system, JPanel loginJPanel) {
        initComponents();
        this.system = system;
        this.loginJPanel = loginJPanel;

        this.setSize(300, 500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        storeNamejLabel = new javax.swing.JLabel();
        deliveryAgentNameTextField = new javax.swing.JTextField();
        addressjLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        registerJButton = new javax.swing.JButton();
        deliveryAgentPhoneTextField = new javax.swing.JTextField();

        backJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        backJButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        storeNamejLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        storeNamejLabel.setText("DeliveryAgentName:");

        deliveryAgentNameTextField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        addressjLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        addressjLabel.setText("Address: ");

        addressTextArea.setColumns(20);
        jScrollPane4.setViewportView(addressTextArea);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setText("AdminUserName:");

        userNameTextField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("Password:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("DeliveryAgentPhoneNumber:");

        passwordJPasswordField.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N

        registerJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        registerJButton.setText("Register");
        registerJButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerJButtonActionPerformed(evt);
            }
        });

        deliveryAgentPhoneTextField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(deliveryAgentPhoneTextField)
                        .addComponent(addressjLabel)
                        .addComponent(jLabel2)
                        .addComponent(storeNamejLabel)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(deliveryAgentNameTextField)
                        .addComponent(jScrollPane4)
                        .addComponent(userNameTextField)
                        .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(registerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(storeNamejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deliveryAgentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deliveryAgentPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerJButton)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        loginJPanel.remove(this);
        CardLayout layout = (CardLayout) loginJPanel.getLayout();
        layout.previous(loginJPanel);        // TODO add your handling code here:
    }//GEN-LAST:event_backJButtonActionPerformed

    private void registerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerJButtonActionPerformed
        String storeName = deliveryAgentNameTextField.getText();
        String address = addressTextArea.getText();
        String phone = deliveryAgentPhoneTextField.getText();
        String userName = userNameTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());

        if (storeName.trim().equals("") || address.trim().equals("") || phone.trim().equals("") || userName.trim().equals("") || password.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Input cannot be empty!");
            return;
        }
         try{
         long l= Long.parseLong(phone);
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
        DeliveryAgentRegisterRequest drr = new DeliveryAgentRegisterRequest();
        drr.setStoreName(storeName);
        drr.setAddress(address);
        drr.setPhoneNumber(phone);
        drr.setUserName(userName);
        drr.setPassword(password);
        drr.setRequestDate(new Date());
        drr.setStatus(Status.Waiting);
        system.getWorkQueue().getWorkRequestList().add(drr);
        JOptionPane.showMessageDialog(this, "Your registation has been sent, please wait for approval!", "Information", JOptionPane.DEFAULT_OPTION);
        deliveryAgentNameTextField.setText("");
        addressTextArea.setText("");
        deliveryAgentPhoneTextField.setText("");
        userNameTextField.setText("");
        passwordJPasswordField.setText("");
        DB4OUtil.getInstance().storeSystem(system);
    }//GEN-LAST:event_registerJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JLabel addressjLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField deliveryAgentNameTextField;
    private javax.swing.JTextField deliveryAgentPhoneTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton registerJButton;
    private javax.swing.JLabel storeNamejLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
