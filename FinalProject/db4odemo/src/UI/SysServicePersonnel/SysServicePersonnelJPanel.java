/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SysServicePersonnel;

import Business.Business.EcoSystem;
import Business.Business.Person;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.DeliveryAgent;
import Business.Enterprise.Enterprise;

import Business.Enterprise.Store;
import Business.Organization.Organization;
import Business.Role.DeliveryAgentAdminRoll;
import Business.Role.StoreAdminRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DeliveryAgentRegisterRequest;
import Business.WorkQueue.Status;
import Business.WorkQueue.StoreRegisterRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tzm
 */
public class SysServicePersonnelJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysServicePersonnelJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    private JFrame frame;
    private Organization organization;

    public SysServicePersonnelJPanel(JPanel userProcessContainer, Organization organization, UserAccount account, EcoSystem system, JFrame frame) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.frame = frame;
        this.organization = organization;
        this.setSize(900, 640);
        populateDeliveryAgentRegistrationJTable1();
        populateStoreRegistrationJTable();

        saveButton1.setEnabled(false);
        cancelButton2.setEnabled(false);
        editButton1.setEnabled(true);
        usernameTextField.setEnabled(false);
        setProfileInfo();
        setProfileFieldsEditable(false);
    }

    private void setProfileInfo() {
        firstNameTextField.setText(account.getPerson().getFirstName());
        lastNameTextField.setText(account.getPerson().getLastName());
        usernameTextField.setText(account.getUsername());
    }

    private void setProfileFieldsEditable(boolean b) {

        firstNameTextField.setEnabled(b);
        lastNameTextField.setEnabled(b);

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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        deliveryAgentRegistrationJTable1 = new javax.swing.JTable();
        btnDeliveryAccept = new javax.swing.JButton();
        refuseDeliveryAgentJButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        storeRegistrationJTable = new javax.swing.JTable();
        btnStoreAccept = new javax.swing.JButton();
        refuseStoreJButton = new javax.swing.JButton();
        profilePanel = new javax.swing.JPanel();
        cancelButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        saveButton1 = new javax.swing.JButton();
        firstNameTextField = new javax.swing.JTextField();
        editButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordPanel = new javax.swing.JPanel();
        passwordField1 = new javax.swing.JPasswordField();
        passwordField2 = new javax.swing.JPasswordField();
        cancelButton1 = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        submitButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        deliveryAgentRegistrationJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DeliveryAgentName", "AdminUserName", "Status", "RequestDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(deliveryAgentRegistrationJTable1);

        btnDeliveryAccept.setFont(new java.awt.Font("宋体", 1, 12)); // NOI18N
        btnDeliveryAccept.setText("Accept");
        btnDeliveryAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryAcceptActionPerformed(evt);
            }
        });

        refuseDeliveryAgentJButton1.setFont(new java.awt.Font("宋体", 1, 12)); // NOI18N
        refuseDeliveryAgentJButton1.setText("Refuse");
        refuseDeliveryAgentJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refuseDeliveryAgentJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnDeliveryAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refuseDeliveryAgentJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeliveryAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refuseDeliveryAgentJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(272, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DeliveryAgent Registration", jPanel3);

        storeRegistrationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "StoreName", "AdminUserName", "Status", "RequestDate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(storeRegistrationJTable);

        btnStoreAccept.setFont(new java.awt.Font("宋体", 1, 12)); // NOI18N
        btnStoreAccept.setText("Accept");
        btnStoreAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreAcceptActionPerformed(evt);
            }
        });

        refuseStoreJButton.setFont(new java.awt.Font("宋体", 1, 12)); // NOI18N
        refuseStoreJButton.setText("Refuse");
        refuseStoreJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refuseStoreJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStoreAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refuseStoreJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStoreAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refuseStoreJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(272, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Store Registration", jPanel1);

        cancelButton2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cancelButton2.setText("Cancel");
        cancelButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Username: ");

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

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                        .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(285, 285, 285))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(334, 334, 334)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(usernameTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton1)
                    .addComponent(saveButton1)
                    .addComponent(cancelButton2))
                .addContainerGap(333, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Profile", profilePanel);

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

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(passwordPanelLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(passwordPanelLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(passwordPanelLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(passwordPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton1))
                .addContainerGap(349, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Change Password", passwordPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStoreAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreAcceptActionPerformed
        int selectedRowIndex = storeRegistrationJTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest wr = (WorkRequest) storeRegistrationJTable.getValueAt(selectedRowIndex, 2);
        if (wr.getStatus() == Status.Accepted) {
            JOptionPane.showMessageDialog(this, "This request has been processed!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        wr.setStatus(Status.Accepted);
        StoreRegisterRequest srr = (StoreRegisterRequest) wr;
        Store s = (Store) system.getEnterpriseDirectory().createAndAddEnterprise(srr.getStoreName(), Enterprise.EnterpriseType.Store);
        Organization org = s.getOrganizationDirectory().createOrganization(Organization.Type.StoreAdmin);
        s.getOrganizationDirectory().createOrganization(Organization.Type.StoreDistributionPersonnel);
        s.getOrganizationDirectory().createOrganization(Organization.Type.StoreReceptionist);

        s.setAddress(srr.getAddress());
        s.setPhoneNumber(srr.getPhoneNumber());
        org.getUserAccountDirectory().createUserAccount(srr.getUserName(), srr.getPassword(), new Person(), new StoreAdminRole());
        populateStoreRegistrationJTable();

    }//GEN-LAST:event_btnStoreAcceptActionPerformed

    private void btnDeliveryAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryAcceptActionPerformed
        int selectedRowIndex = deliveryAgentRegistrationJTable1.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest wr = (WorkRequest) deliveryAgentRegistrationJTable1.getValueAt(selectedRowIndex, 2);
        if (wr.getStatus() == Status.Accepted) {
            JOptionPane.showMessageDialog(this, "This request has been processed!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        wr.setStatus(Status.Accepted);
        DeliveryAgentRegisterRequest darr = (DeliveryAgentRegisterRequest) wr;
        DeliveryAgent da = (DeliveryAgent) system.getEnterpriseDirectory().createAndAddEnterprise(darr.getStoreName(), Enterprise.EnterpriseType.DeliveryAgent);
        Organization org = da.getOrganizationDirectory().createOrganization(Organization.Type.DeliveryAgentAdmin);
        da.getOrganizationDirectory().createOrganization(Organization.Type.DeliveryMan);
        da.getOrganizationDirectory().createOrganization(Organization.Type.DistributionCenters);
        da.getOrganizationDirectory().createOrganization(Organization.Type.Driver);
        da.setAddress(darr.getAddress());
        da.setPhoneNumber(darr.getPhoneNumber());
        org.getUserAccountDirectory().createUserAccount(darr.getUserName(), darr.getPassword(), new Person(), new DeliveryAgentAdminRoll());
        populateDeliveryAgentRegistrationJTable1();
    }//GEN-LAST:event_btnDeliveryAcceptActionPerformed

    private void refuseStoreJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refuseStoreJButtonActionPerformed
        int selectedRowIndex = storeRegistrationJTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest wr = (WorkRequest) storeRegistrationJTable.getValueAt(selectedRowIndex, 2);
        if (wr.getStatus() == Status.Accepted) {
            JOptionPane.showMessageDialog(this, "This request has been recepted!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        system.getWorkQueue().getWorkRequestList().remove(wr);
        populateStoreRegistrationJTable();

    }//GEN-LAST:event_refuseStoreJButtonActionPerformed

    private void refuseDeliveryAgentJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refuseDeliveryAgentJButton1ActionPerformed
        int selectedRowIndex = deliveryAgentRegistrationJTable1.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest wr = (WorkRequest) deliveryAgentRegistrationJTable1.getValueAt(selectedRowIndex, 2);
        if (wr.getStatus() == Status.Accepted) {
            JOptionPane.showMessageDialog(this, "This request has been recepted!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        system.getWorkQueue().getWorkRequestList().remove(wr);
        populateDeliveryAgentRegistrationJTable1();
    }//GEN-LAST:event_refuseDeliveryAgentJButton1ActionPerformed

    private void cancelButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton2ActionPerformed
        setProfileFieldsEditable(false);
        setProfileInfo();

        saveButton1.setEnabled(false);
        cancelButton2.setEnabled(false);
        editButton1.setEnabled(true);
    }//GEN-LAST:event_cancelButton2ActionPerformed

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        if (firstNameTextField.getText().trim().equals("") || lastNameTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Input cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {

            account.getPerson().setFirstName(firstNameTextField.getText());
            account.getPerson().setLastName(lastNameTextField.getText());

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
    private void resetPasswordField() {
        passwordField.setText("");
        passwordField1.setText("");
        passwordField2.setText("");
    }
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
    private void populateDeliveryAgentRegistrationJTable1() {
        DefaultTableModel model = (DefaultTableModel) deliveryAgentRegistrationJTable1.getModel();

        model.setRowCount(0);

        for (WorkRequest wr : system.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof DeliveryAgentRegisterRequest) {
                DeliveryAgentRegisterRequest darr = (DeliveryAgentRegisterRequest) wr;
                Object[] row = new Object[4];
                row[0] = darr.getStoreName();
                row[1] = darr.getUserName();
                row[2] = wr;
                row[3] = wr.dataFormat(wr.getRequestDate());
                model.addRow(row);

            }
        }

    }

    private void populateStoreRegistrationJTable() {
        DefaultTableModel model = (DefaultTableModel) storeRegistrationJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest wr : system.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof StoreRegisterRequest) {
                StoreRegisterRequest srr = (StoreRegisterRequest) wr;
                Object[] row = new Object[4];
                row[0] = srr.getStoreName();
                row[1] = srr.getUserName();
                row[2] = wr;
                row[3] = wr.dataFormat(wr.getRequestDate());
                model.addRow(row);

            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeliveryAccept;
    private javax.swing.JButton btnStoreAccept;
    private javax.swing.JButton cancelButton1;
    private javax.swing.JButton cancelButton2;
    private javax.swing.JTable deliveryAgentRegistrationJTable1;
    private javax.swing.JButton editButton1;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JButton refuseDeliveryAgentJButton1;
    private javax.swing.JButton refuseStoreJButton;
    private javax.swing.JButton saveButton1;
    private javax.swing.JTable storeRegistrationJTable;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}