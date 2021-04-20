/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Store;

import Business.Business.EcoSystem;
import Business.Customer.Order;
import Business.DB4OUtil.DB4OUtil;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Item;
import Business.Enterprise.Store;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Status;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 10643
 */
public class StoreDistributionPersonnelJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StoreDistributionPersonnelJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    private JFrame frame;
    private Organization organization;
    private Store store;
    private Role role;
    private Enterprise enterprise;
    private Employee employee;
    public StoreDistributionPersonnelJPanel(JPanel userProcessContainer, Organization organization, Enterprise enterprise, UserAccount account, EcoSystem system, JFrame frame) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.frame = frame;
        this.organization = organization;
        this.enterprise = enterprise;
        this.store = (Store) enterprise;
        employee = (Employee) account.getPerson();
        this.setSize(920, 700);
        
        populateorderTable();
        setProfileFieldsEditable(false);
        setProfileInfo();
        saveButton1.setEnabled(false);
        cancelButton2.setEnabled(false);
        editButton1.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ConfirmOrderButton = new javax.swing.JButton();
        cancelOrderButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderDetailTable = new javax.swing.JTable();
        ChooseDeliveryCompanyPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TotalPriceTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        addressTextField = new javax.swing.JTextField();
        cancelButton2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        saveButton1 = new javax.swing.JButton();
        firstNameTextField = new javax.swing.JTextField();
        editButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        passwordField1 = new javax.swing.JPasswordField();
        passwordField2 = new javax.swing.JPasswordField();
        cancelButton1 = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        submitButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel6.setText("Details: ");

        ConfirmOrderButton.setText("Confirm Order");
        ConfirmOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmOrderButtonActionPerformed(evt);
            }
        });

        cancelOrderButton.setText("Cancel Order");
        cancelOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderButtonActionPerformed(evt);
            }
        });

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Order Date", "Customer", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(orderTable);

        orderDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(orderDetailTable);

        ChooseDeliveryCompanyPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel1.setText("Pending Orders:");

        jLabel2.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel2.setText("Total price：");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                                .addComponent(jScrollPane3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(TotalPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChooseDeliveryCompanyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ConfirmOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ConfirmOrderButton)
                        .addComponent(cancelOrderButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TotalPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ChooseDeliveryCompanyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Process Order", jPanel2);

        cancelButton2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cancelButton2.setText("Cancel");
        cancelButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton2ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel18.setText("Phone: ");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Username: ");

        saveButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        saveButton1.setText("Save");
        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });

        editButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        editButton1.setText("Edit");
        editButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel12.setText("First Name: ");

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel16.setText("Last Name: ");

        usernameTextField.setEnabled(false);
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel17.setText("Address: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel10)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstNameTextField)
                                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(44, 44, 44)
                                    .addComponent(phoneTextField))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addGap(33, 33, 33)
                                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton1)
                    .addComponent(saveButton1)
                    .addComponent(cancelButton2))
                .addContainerGap(258, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Profile", jPanel3);

        cancelButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cancelButton1.setText("Cancel");
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton1ActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel15.setText("Confirm Password:");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel14.setText("New Password:");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel13.setText("Old Password:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton1))
                .addContainerGap(333, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Change Password", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmOrderButtonActionPerformed
        int index = orderTable.getSelectedRow();
        
        if (orderTable.getSelectedRow() >= 0) {
            Order order = (Order) orderTable.getValueAt(index, 2);
                if(order.getStatus()!= Status.Waiting){
                JOptionPane.showMessageDialog(this, "This Order had been solved.");
                return;
                }
                
            order.setStatus(Status.Accepted);
            DB4OUtil.getInstance().storeSystem(system);

            ChooseDeliveryJPanel cdp = new ChooseDeliveryJPanel(system, this, ChooseDeliveryCompanyPanel, this.store, order);
            this.ChooseDeliveryCompanyPanel.add(cdp);
            CardLayout layout = (CardLayout) ChooseDeliveryCompanyPanel.getLayout();
            layout.next(ChooseDeliveryCompanyPanel);
        }else{
            JOptionPane.showMessageDialog(null, "Please select an order");
        }
        
    }//GEN-LAST:event_ConfirmOrderButtonActionPerformed

    private void cancelOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderButtonActionPerformed
        int index = orderTable.getSelectedRow();
        if (orderTable.getSelectedRow() >= 0) {
            Order order = (Order) orderTable.getValueAt(index, 2);
            if(order.getStatus()!= Status.Waiting){
                JOptionPane.showMessageDialog(this, "This Order had been solved.");
                return;
            }
            order.setStatus(Status.Refused);
            DB4OUtil.getInstance().storeSystem(system);
            populateorderTable();
            populateDetailTable(order);
        }else{
            JOptionPane.showMessageDialog(null, "Please select an order");
        }
    }//GEN-LAST:event_cancelOrderButtonActionPerformed

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked
        int index = orderTable.getSelectedRow();

        if (index >= 0) {
            Order order = (Order)orderTable.getValueAt(index, 2);
            populateDetailTable(order);
            TotalPriceTextField.setText(String.valueOf(order.calculatePrice()));
        }
        
    }//GEN-LAST:event_orderTableMouseClicked

    private void cancelButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton2ActionPerformed
        setProfileFieldsEditable(false);
        setProfileInfo();

        saveButton1.setEnabled(false);
        cancelButton2.setEnabled(false);
        editButton1.setEnabled(true);
    }//GEN-LAST:event_cancelButton2ActionPerformed

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        if (firstNameTextField.getText().trim().equals("") || lastNameTextField.getText().trim().equals("") || addressTextField.getText().trim().equals("")
            || phoneTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Input cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {

            account.getPerson().setFirstName(firstNameTextField.getText());
            account.getPerson().setLastName(lastNameTextField.getText());
            employee.setAddress(addressTextField.getText());
            employee.setPhone(phoneTextField.getText());
        }

        setProfileFieldsEditable(false);
        saveButton1.setEnabled(false);
        cancelButton2.setEnabled(false);
        editButton1.setEnabled(true);

        DB4OUtil.getInstance().storeSystem(system);
    }//GEN-LAST:event_saveButton1ActionPerformed

    private void editButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton1ActionPerformed
        saveButton1.setEnabled(true);
        cancelButton2.setEnabled(true);
        editButton1.setEnabled(false);

        setProfileFieldsEditable(true);
    }//GEN-LAST:event_editButton1ActionPerformed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton1ActionPerformed
        resetPasswordField();
    }//GEN-LAST:event_cancelButton1ActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        char[] passwordCharArray = passwordField2.getPassword();
        String password = String.valueOf(passwordCharArray);
        char[] passwordCharArray1 = passwordField.getPassword();
        String new1 = String.valueOf(passwordCharArray1);
        char[] passwordCharArray2 = passwordField1.getPassword();
        String new2 = String.valueOf(passwordCharArray2);

        if (password.equals(account.getPassword())) {
            if (!new1.equals("")) {
                if (new1.equals(new2)) {
                    account.setPassword(new1);
                    JOptionPane.showMessageDialog(null, "Password updated successfully!");
                    DB4OUtil.getInstance().storeSystem(system);
                    resetPasswordField();
                } else {
                    JOptionPane.showMessageDialog(null, "Passwords don't match!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Password can't be empty!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Password is not correct!");
        }
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChooseDeliveryCompanyPanel;
    private javax.swing.JButton ConfirmOrderButton;
    private javax.swing.JTextField TotalPriceTextField;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton cancelButton1;
    private javax.swing.JButton cancelButton2;
    private javax.swing.JButton cancelOrderButton;
    private javax.swing.JButton editButton1;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTable orderDetailTable;
    private javax.swing.JTable orderTable;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton saveButton1;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

    private void populateorderTable() {
        DefaultTableModel dtm = (DefaultTableModel) orderTable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest wr : store.getWorkQueue().getWorkRequestList()) {
            if(wr instanceof Order){
                Order order = (Order) wr;
                Object row[] = new Object[3];
                row[0] = order.getRequestDate();
                row[1] = order.getSender();
                row[2] = order;
                dtm.addRow(row);
            }
        }
    }

    private void populateDetailTable(Order order) {
        DefaultTableModel model = (DefaultTableModel) orderDetailTable.getModel();
        model.setRowCount(0);
        for (Map.Entry<Item, Integer> o : order.getOrderItem().entrySet()) {
            Object[] row = new Object[3];
            row[0] = o.getKey();
            row[1] = o.getValue();
            row[2] = o.getKey().getUnitPrice() * o.getValue();
            model.addRow(row);
        }
        
    }
    private void setProfileFieldsEditable(boolean b) {

        firstNameTextField.setEnabled(b);
        lastNameTextField.setEnabled(b);
        addressTextField.setEnabled(b);
        phoneTextField.setEnabled(b);

    }
    private void setProfileInfo() {
        firstNameTextField.setText(account.getPerson().getFirstName());
        lastNameTextField.setText(account.getPerson().getLastName());
        usernameTextField.setText(account.getUsername());

        addressTextField.setText(employee.getAddress());
        phoneTextField.setText(employee.getPhone());
    }
    private void resetPasswordField() {
        passwordField.setText("");
        passwordField1.setText("");
        passwordField2.setText("");
    }
}
