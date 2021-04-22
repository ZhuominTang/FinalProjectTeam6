/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DeliveryAgent;

import Business.Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.DistributionCenter.DistributionCenter;
import Business.DistributionCenter.DistributionCenterDirectory;
import Business.Driver.Driver;
import Business.Driver.DriverDirectory;
import Business.Enterprise.DeliveryAgent;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Store;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UI.Store.CreateEmployeeJPanel;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 加藤鹰
 */
public class DeliveryAgentJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
private EcoSystem system;
private DriverDirectory driverDirectory;
private DistributionCenterDirectory distributionCenterDirectory;
private DeliveryManDirectory deliveryManDirectory;
  private UserAccount account;
    private JFrame frame;
    private Organization organization;
    private Store store;
    private Role role;
    private Enterprise enterprise;
    private DeliveryAgent deliveryAgent;
    /**
     * Creates new form DeliveryAgentJPanel
     */
    public DeliveryAgentJPanel() {
        initComponents();
    }

    public DeliveryAgentJPanel(JPanel userProcessContainer, EcoSystem system, DriverDirectory driverDirectory, DistributionCenterDirectory distributionCenterDirectory, DeliveryManDirectory deliveryManDirectory, UserAccount account, JFrame frame, Organization organization,  Enterprise enterprise) {
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.driverDirectory = driverDirectory;
        this.distributionCenterDirectory = distributionCenterDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.account = account;
        this.frame = frame;
        this.organization = organization;
      
      
        this.enterprise = enterprise;
        initComponents();
        this.setSize(900, 640);
        
       // populateDeliveryCenterTable();
      //  populateDeliveryMan();
       // populateDriver();
        editButton.setEnabled(true);
        saveButton.setEnabled(false);
        cancelButton.setEnabled(false);
       // setOverviewFieldsEditable(false);
      //  setOverviewInfo();
    }

    public void populateDeliveryCenterTable() {
        DefaultTableModel dtm = (DefaultTableModel) DeliveryCenterTable.getModel();
        dtm.setRowCount(0);
//        if (ecosystem.getDistributionCenterDirectory().getDistributionCenterDirectory() != null){
        for(DistributionCenter distributionCenter : distributionCenterDirectory.getDistributionCenterDirectory()){
            Object [] row = new Object[3];
            row[0] = distributionCenter;
            row[1] = distributionCenter.getAddress();          
            row[2] = distributionCenter.getPhoneNumber();
            dtm.addRow(row);
        }
    //    }else{System.out.print("wrong");}
        
    }
    
    
    
     public void populateDeliveryMan() {
        DefaultTableModel dtm = (DefaultTableModel) ManageDeliveryManTable1.getModel();
        dtm.setRowCount(0);
        for(DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryManDirectory()){
            Object [] row = new Object[3];
            row[0] = deliveryMan;
            row[1] = deliveryMan.getAddress();
            row[2] = deliveryMan.getPhoneNumber();
            dtm.addRow(row);
        }
    }
     
     
     private void populateDriver() {
          DefaultTableModel dtm = (DefaultTableModel)  ManageDriverTable.getModel();
        dtm.setRowCount(0);
        for(Driver driver : system.getDriverDirectory().getDriverDirectory()){
            Object [] row = new Object[3];
            row[0] = driver;          
            row[1] = driver.getAddress();
            row[2] = driver.getPhoneNumber();   
            dtm.addRow(row);
        }
    }
    
    //public DeliveryAgentJPanel(JPanel userProcessContainer, EcoSystem system, DriverDirectory driverDirectory, DistributionCenterDirectory distributionCenterDirectory, DeliveryManDirectory deliveryManDirectory) {
        
      //   initComponents();
        //this.userProcessContainer=userProcessContainer;
       // this.system=system;
        
        
        //remove 
       // this.driverDirectory = system.getDriverDirectory();
      //  this.deliveryManDirectory = system.getDeliveryManDirectory();
        //this.distributionCenterDirectory = system.getDistributionCenterDirectory();
   // }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        ManageDeliveryCenterjPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DeliveryCenterTable = new javax.swing.JTable();
        createPanel = new javax.swing.JPanel();
        CreatejButton1 = new javax.swing.JButton();
        RemovejButton2 = new javax.swing.JButton();
        ManageDriverjPanel = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ManageDriverTable = new javax.swing.JTable();
        workPanel = new javax.swing.JPanel();
        createButton1 = new javax.swing.JButton();
        ManageDelivertManJPanel = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ManageDeliveryManTable1 = new javax.swing.JTable();
        workPanel1 = new javax.swing.JPanel();
        createButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        reviewTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JPasswordField();
        passwordField2 = new javax.swing.JPasswordField();
        cancelButton1 = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        submitButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        jPanel2.setPreferredSize(new java.awt.Dimension(900, 640));

        DeliveryCenterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Address", "PhoneNumber"
            }
        ));
        DeliveryCenterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeliveryCenterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DeliveryCenterTable);

        createPanel.setLayout(new java.awt.CardLayout());

        CreatejButton1.setText("Create DeliveryCenter");
        CreatejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatejButton1ActionPerformed(evt);
            }
        });

        RemovejButton2.setText("Remove DeliveryCenter");
        RemovejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovejButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageDeliveryCenterjPanelLayout = new javax.swing.GroupLayout(ManageDeliveryCenterjPanel);
        ManageDeliveryCenterjPanel.setLayout(ManageDeliveryCenterjPanelLayout);
        ManageDeliveryCenterjPanelLayout.setHorizontalGroup(
            ManageDeliveryCenterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDeliveryCenterjPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ManageDeliveryCenterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageDeliveryCenterjPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(createPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ManageDeliveryCenterjPanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(ManageDeliveryCenterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CreatejButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(RemovejButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(86, 86, 86))
        );
        ManageDeliveryCenterjPanelLayout.setVerticalGroup(
            ManageDeliveryCenterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDeliveryCenterjPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ManageDeliveryCenterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageDeliveryCenterjPanelLayout.createSequentialGroup()
                        .addComponent(createPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CreatejButton1)
                        .addGap(36, 36, 36)
                        .addComponent(RemovejButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ManageDeliveryCenter", ManageDeliveryCenterjPanel);

        ManageDriverjPanel.setPreferredSize(new java.awt.Dimension(900, 640));

        ManageDriverTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "phone", "adress"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ManageDriverTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        ManageDriverTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageDriverTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(ManageDriverTable);

        workPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        workPanel.setLayout(new java.awt.CardLayout());

        createButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        createButton1.setText("Create Driver");
        createButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageDriverjPanelLayout = new javax.swing.GroupLayout(ManageDriverjPanel);
        ManageDriverjPanel.setLayout(ManageDriverjPanelLayout);
        ManageDriverjPanelLayout.setHorizontalGroup(
            ManageDriverjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDriverjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageDriverjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ManageDriverjPanelLayout.setVerticalGroup(
            ManageDriverjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDriverjPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(ManageDriverjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ManageDriverjPanelLayout.createSequentialGroup()
                        .addComponent(createButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(workPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ManageDriver", ManageDriverjPanel);

        ManageDelivertManJPanel.setPreferredSize(new java.awt.Dimension(900, 640));

        ManageDeliveryManTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "phone", "adress"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ManageDeliveryManTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        ManageDeliveryManTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageDeliveryManTable1MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(ManageDeliveryManTable1);

        workPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        workPanel1.setLayout(new java.awt.CardLayout());

        createButton2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        createButton2.setText("Create DeliveryMan");
        createButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageDelivertManJPanelLayout = new javax.swing.GroupLayout(ManageDelivertManJPanel);
        ManageDelivertManJPanel.setLayout(ManageDelivertManJPanelLayout);
        ManageDelivertManJPanelLayout.setHorizontalGroup(
            ManageDelivertManJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDelivertManJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageDelivertManJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ManageDelivertManJPanelLayout.setVerticalGroup(
            ManageDelivertManJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDelivertManJPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(ManageDelivertManJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ManageDelivertManJPanelLayout.createSequentialGroup()
                        .addComponent(createButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(workPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ManageDeliveryMan", ManageDelivertManJPanel);

        reviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "RequestDate", "ResolveDate", "Customer", "Deliveryman", "Status", "CustomerMessage", "DeliverymanMessage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reviewTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reviewTableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(reviewTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Review", jPanel5);

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel13.setText("Old Password:");

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton1))
                .addContainerGap(389, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Change Password", jPanel6);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("DeliveryAgentName:");

        nameTextField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Address: ");

        addressTextArea.setColumns(20);
        jScrollPane4.setViewportView(addressTextArea);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Phone:");

        phoneTextField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        editButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(phoneTextField))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addGap(284, 284, 284))
        );

        jTabbedPane1.addTab("ManageDeliveryAgentInformation", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DeliveryCenterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeliveryCenterTableMouseClicked
        int index = DeliveryCenterTable.getSelectedRow();

        if (index >= 0) {
            DistributionCenter item = (DistributionCenter) DeliveryCenterTable.getValueAt(index, 0);

            RemovejButton2.setEnabled(true);
        }
    }//GEN-LAST:event_DeliveryCenterTableMouseClicked

    private void CreatejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatejButton1ActionPerformed
        CreateDeliveryCenterJPanel p = new CreateDeliveryCenterJPanel(system, this, createPanel, this.store);
        this.createPanel.add(p);
        CardLayout layout = (CardLayout)createPanel.getLayout();
        layout.next(createPanel);
        populateDeliveryCenterTable();
    }//GEN-LAST:event_CreatejButton1ActionPerformed

    private void RemovejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovejButton2ActionPerformed
     
        
         int selectedRow = DeliveryCenterTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DistributionCenter distributionCenter = (DistributionCenter) DeliveryCenterTable.getValueAt(selectedRow, 0);
        distributionCenterDirectory.removeDistributionCenter(distributionCenter);
       populateDeliveryCenterTable();
    }//GEN-LAST:event_RemovejButton2ActionPerformed

    private void ManageDriverTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageDriverTableMouseClicked

    }//GEN-LAST:event_ManageDriverTableMouseClicked

    private void createButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButton1ActionPerformed
        this.workPanel.removeAll();
        CreateDriverJPanel ep = new CreateDriverJPanel(this.system, this, this.workPanel, this.enterprise);
        this.workPanel.add(ep);
        CardLayout layout = (CardLayout) this.workPanel.getLayout();
        layout.next(this.workPanel);
    }//GEN-LAST:event_createButton1ActionPerformed

    private void reviewTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewTableMouseClicked

    }//GEN-LAST:event_reviewTableMouseClicked

    private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton1ActionPerformed
        passwordField.setText("");
        passwordField1.setText("");
        passwordField2.setText("");
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
                    passwordField.setText("");
                    passwordField1.setText("");
                    passwordField2.setText("");
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

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        saveButton.setEnabled(true);
        cancelButton.setEnabled(true);
        editButton.setEnabled(false);

        setOverviewFieldsEditable(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (!phoneTextField.getText().equals("") && !addressTextArea.getText().equals("")
            && !nameTextField.getText().equals("")) {
            deliveryAgent.setName(nameTextField.getText());
            deliveryAgent.setAddress(addressTextArea.getText());
            deliveryAgent.setPhoneNumber(phoneTextField.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Information can't be empty");
            return;
        }
        setOverviewFieldsEditable(false);
        setOverviewInfo();
        saveButton.setEnabled(false);
        cancelButton.setEnabled(false);
        editButton.setEnabled(true);

        DB4OUtil.getInstance().storeSystem(system);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setOverviewFieldsEditable(false);
        setOverviewInfo();

        saveButton.setEnabled(false);
        cancelButton.setEnabled(false);
        editButton.setEnabled(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void ManageDeliveryManTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageDeliveryManTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageDeliveryManTable1MouseClicked

    private void createButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButton2ActionPerformed
        // TODO add your handling code here:
        this.workPanel.removeAll();
       CreateDeliveryManJPanel ep = new CreateDeliveryManJPanel(this.system, this, this.workPanel, this.enterprise);
        this.workPanel.add(ep);
        CardLayout layout = (CardLayout) this.workPanel.getLayout();
        layout.next(this.workPanel);
    }//GEN-LAST:event_createButton2ActionPerformed
   private void setOverviewFieldsEditable(boolean b) {
        nameTextField.setEnabled(b);
        phoneTextField.setEnabled(b);
        addressTextArea.setEnabled(b);
    }

    private void setOverviewInfo() {
        nameTextField.setText(deliveryAgent.getName());
        phoneTextField.setText(deliveryAgent.getPhoneNumber());
        addressTextArea.setText(deliveryAgent.getAddress());
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreatejButton1;
    private javax.swing.JTable DeliveryCenterTable;
    private javax.swing.JPanel ManageDelivertManJPanel;
    private javax.swing.JPanel ManageDeliveryCenterjPanel;
    private javax.swing.JTable ManageDeliveryManTable1;
    private javax.swing.JTable ManageDriverTable;
    private javax.swing.JPanel ManageDriverjPanel;
    private javax.swing.JButton RemovejButton2;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelButton1;
    private javax.swing.JButton createButton1;
    private javax.swing.JButton createButton2;
    private javax.swing.JPanel createPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTable reviewTable;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JPanel workPanel;
    private javax.swing.JPanel workPanel1;
    // End of variables declaration//GEN-END:variables
}
