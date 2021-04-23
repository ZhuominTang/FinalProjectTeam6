/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DeliveryWork;

import Business.Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.DeliveryManOrganization;
import Business.Organization.DistributionCentersOrganization;
import Business.Organization.DriverOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Commodity;
import Business.WorkQueue.ShippingOrder;
import Business.WorkQueue.Status;
import Business.WorkQueue.WorkRequest;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 加藤鹰
 */
public class DeliveryCenterMainJPanel extends javax.swing.JPanel {

         private Enterprise enterprise;
         private JPanel userProcessContainer;
         private  Organization organization;
         private UserAccount account;
         private EcoSystem system;
         private JFrame frame;
         private Employee employee;
    /**
     * Creates new form DeliveryCenterJPanel
     */
    public DeliveryCenterMainJPanel(JPanel userProcessContainer, Organization organization, Enterprise enterprise, UserAccount account, EcoSystem system, JFrame frame) {
        initComponents();
                this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.frame = frame;
        this.organization = organization;
        this.enterprise = enterprise;
       
        this.setSize(900, 640);
        //Driver panel
         populateDriverJTable();
         populateChooseDriver();
         
         
         //DeliveryMan panel
         populateDerliveryManJTable();
         populateChooseDeliveryMan() ;
        
        
        setProfileInfo();
         setProfileFieldsEditable(false);
    }

    
          
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DriverjTable = new javax.swing.JTable();
        AssignjButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ChooseDriverjComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DriveryManjTable = new javax.swing.JTable();
        ChooseDeliveryManjComboBox2 = new javax.swing.JComboBox();
        AssignDeliveryManjButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        passwordPanel = new javax.swing.JPanel();
        passwordField1 = new javax.swing.JPasswordField();
        passwordField2 = new javax.swing.JPasswordField();
        cancelButton1 = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        submitButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        profilePanel1 = new javax.swing.JPanel();
        cancelButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        saveButton1 = new javax.swing.JButton();
        firstNameTextField = new javax.swing.JTextField();
        editButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        AddressTextField = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Driver");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        DriverjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "StoreAddress", "StoreName", "Status", "Driver", "RequestDate", "ReceiveDate"
            }
        ));
        jScrollPane2.setViewportView(DriverjTable);

        AssignjButton1.setText("Assign");
        AssignjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignjButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel4.setText("ShippingOrder Transfer To DeliveryCenter");

        ChooseDriverjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseDriverjComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                                .addComponent(AssignjButton1)
                                .addGap(18, 18, 18)
                                .addComponent(ChooseDriverjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AssignjButton1)
                    .addComponent(ChooseDriverjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addGap(164, 164, 164))
        );

        jTabbedPane1.addTab("ManageDriver", jPanel2);

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage DeliveryMan");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        DriveryManjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CustomerAddress", "CustomerPhoneNumer", "Status", "DeliveryMan", "RequsetDate", "DeliveryDate"
            }
        ));
        jScrollPane3.setViewportView(DriveryManjTable);

        ChooseDeliveryManjComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ChooseDeliveryManjComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseDeliveryManjComboBox2ActionPerformed(evt);
            }
        });

        AssignDeliveryManjButton.setText("Assign");
        AssignDeliveryManjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignDeliveryManjButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel5.setText("ShippingOrder Transfer To Customer");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AssignDeliveryManjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChooseDeliveryManjComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AssignDeliveryManjButton)
                    .addComponent(ChooseDeliveryManjComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ManageDeliveryMan", jPanel3);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(352, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Change Password", passwordPanel);

        cancelButton2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cancelButton2.setText("Cancel");
        cancelButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton2ActionPerformed(evt);
            }
        });

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

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel18.setText("DistributionPhone: ");

        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel17.setText("Address: ");

        javax.swing.GroupLayout profilePanel1Layout = new javax.swing.GroupLayout(profilePanel1);
        profilePanel1.setLayout(profilePanel1Layout);
        profilePanel1Layout.setHorizontalGroup(
            profilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanel1Layout.createSequentialGroup()
                .addGroup(profilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanel1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addGroup(profilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(profilePanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addGroup(profilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(profilePanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(profilePanel1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addGroup(profilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(profilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(profilePanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        profilePanel1Layout.setVerticalGroup(
            profilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(profilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(profilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(profilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(profilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(profilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(AddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(profilePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton1)
                    .addComponent(saveButton1)
                    .addComponent(cancelButton2))
                .addContainerGap(278, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Profile", profilePanel1);

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

    
    
    
    

        
        
        
        
       
        
   public void populateDriverJTable(){
         DefaultTableModel dtm = (DefaultTableModel) DriverjTable.getModel();
        dtm.setRowCount(0);
       
            for(WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()){
                 if(wr instanceof ShippingOrder){
                   Object[] row = new Object[6];
                    row[0] = ((ShippingOrder) wr).getStoreAddress();
                    row[1] = ((ShippingOrder) wr).getStoreEnterprise().getName();
                    row[2] = wr;
                    if(wr.getReceiver()!=null){
                    row[3] = wr.getReceiver().getUsername();}
                     row[4] = wr.dataFormat(wr.getRequestDate());
                    if(wr.getResolveDate()!=null){
                    row[5] = wr.dataFormat(wr.getResolveDate());
                    }
                    dtm.addRow(row);    
            }
        }
            
    }
   
   
   
   
   
   public void populateDerliveryManJTable(){
         DefaultTableModel dtm = (DefaultTableModel) DriveryManjTable.getModel();
        dtm.setRowCount(0);
       
            for(WorkRequest wr2 : enterprise.getWorkQueue().getWorkRequestList()){
            if(wr2 instanceof  Commodity){
                 Object[] row = new Object[6];
                    row[0] = ((Commodity) wr2).getCustomerAddress();
                    row[1] = ((Commodity) wr2).getCustomerPhone();
                    row[2] = wr2;
                     if(wr2.getReceiver()!=null){
                    row[3] =  wr2.getReceiver().getUsername();}
                       if(wr2.getRequestDate()!=null){
                    row[4] = wr2.dataFormat(wr2.getRequestDate());
                     }
                   if(wr2.getResolveDate()!=null){
                    row[5] = wr2.dataFormat(wr2.getResolveDate());
                    }
                    dtm.addRow(row);    
            }
        }
            
    }
    
    
    
  
    private void cancelButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton2ActionPerformed
        setProfileFieldsEditable(false);
        setProfileInfo();

        saveButton1.setEnabled(false);
        cancelButton2.setEnabled(false);
        editButton1.setEnabled(true);
    }//GEN-LAST:event_cancelButton2ActionPerformed

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        if (firstNameTextField.getText().trim().equals("") || lastNameTextField.getText().trim().equals("") 
            || phoneTextField.getText().trim().equals("")|| AddressTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Input cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
  try {
               long l= Long.parseLong(phoneTextField.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Incorrect phone number input format!");
                return;
            }
            account.getPerson().setFirstName(firstNameTextField.getText());
           account.getPerson().setLastName(lastNameTextField.getText());
           
          
        
        DistributionCentersOrganization dc = (DistributionCentersOrganization)organization;
        dc.setAddress(AddressTextField.getText());
        dc.setPhoneNumber(phoneTextField.getText());
       
           
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

    
    private void setProfileFieldsEditable(boolean b) {

        firstNameTextField.setEnabled(b);
        lastNameTextField.setEnabled(b);
       
        phoneTextField.setEnabled(b);
        AddressTextField.setEnabled(b);

    }
    private void setProfileInfo() {
        firstNameTextField.setText(account.getPerson().getFirstName());
        lastNameTextField.setText(account.getPerson().getLastName());
        usernameTextField.setText(account.getUsername());
        
        DistributionCentersOrganization dc = (DistributionCentersOrganization)organization;
        
        phoneTextField.setText(dc.getPhoneNumber());
        AddressTextField.setText(dc.getAddress());
    }
    
    
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
        DB4OUtil.getInstance().storeSystem(system);

    }//GEN-LAST:event_submitButtonActionPerformed

    private void AssignjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignjButton1ActionPerformed
          int selectedRow = DriverjTable.getSelectedRow();  
           if (selectedRow< 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        ShippingOrder order = (ShippingOrder) DriverjTable.getValueAt(selectedRow,2);  
       if(order.getStatus()==Status.Waiting){            
            order.setStatus(Status.Sending);           
          UserAccount ua = (UserAccount) ChooseDriverjComboBox1.getSelectedItem();
          order.setReceiver(ua);
          ua.getWorkQueue().getWorkRequestList().add(order);
           DB4OUtil.getInstance().storeSystem(system);
         populateDriverJTable();
       }      else{
           JOptionPane.showMessageDialog(null, "the order can not be delivered again");
       }
         // TODO add your handling code here:
    }//GEN-LAST:event_AssignjButton1ActionPerformed

    private void ChooseDriverjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseDriverjComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChooseDriverjComboBox1ActionPerformed

    private void ChooseDeliveryManjComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseDeliveryManjComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChooseDeliveryManjComboBox2ActionPerformed

    private void AssignDeliveryManjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignDeliveryManjButtonActionPerformed
         int selectedRow = DriveryManjTable.getSelectedRow();
          if (selectedRow< 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Commodity order = (Commodity) DriveryManjTable.getValueAt(selectedRow,2);  
       if(order.getStatus()==Status.Waiting){            
            order.setStatus(Status.Sending);           
          UserAccount ua = (UserAccount) ChooseDeliveryManjComboBox2.getSelectedItem();
          order.setReceiver(ua);
          order.setDeliveryManName(ua.getPerson().returnFullName());
          order.setRequestDate(new Date());
          order.setDeliveryManPhone(((Employee)ua.getPerson()).getPhone());
          order.getOrder().setDeliverymanName(order.getDeliveryManName());
          ua.getWorkQueue().getWorkRequestList().add(order);
           DB4OUtil.getInstance().storeSystem(system);
         populateDerliveryManJTable();
       }      else{
           JOptionPane.showMessageDialog(null, "the order can not be delivered again");
       }
    }//GEN-LAST:event_AssignDeliveryManjButtonActionPerformed

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextFieldActionPerformed
 public void populateChooseDriver() {
        ChooseDriverjComboBox1.removeAllItems();
          for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {

            if (org instanceof DriverOrganization) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                    ChooseDriverjComboBox1.addItem(ua);
                   }             
             }      
          }
  }
 
 
 
 public void populateChooseDeliveryMan() {
        ChooseDeliveryManjComboBox2.removeAllItems();
          for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {

            if (org instanceof DeliveryManOrganization) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                    ChooseDeliveryManjComboBox2.addItem(ua);
                   }             
             }      
          }
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JButton AssignDeliveryManjButton;
    private javax.swing.JButton AssignjButton1;
    private javax.swing.JComboBox ChooseDeliveryManjComboBox2;
    private javax.swing.JComboBox<UserAccount> ChooseDriverjComboBox1;
    private javax.swing.JTable DriverjTable;
    private javax.swing.JTable DriveryManjTable;
    private javax.swing.JButton cancelButton1;
    private javax.swing.JButton cancelButton2;
    private javax.swing.JButton editButton1;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JPanel profilePanel1;
    private javax.swing.JButton saveButton1;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
