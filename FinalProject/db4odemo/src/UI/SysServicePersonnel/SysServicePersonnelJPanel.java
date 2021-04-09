/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SysServicePersonnel;

import Business.Business.EcoSystem;
import Business.Business.Person;
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        storeRegistrationJTable = new javax.swing.JTable();
        btnStoreAccept = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDeliveryAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeliveryAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnStoreAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStoreAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Store Registration", jPanel1);

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
    private javax.swing.JTable deliveryAgentRegistrationJTable1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable storeRegistrationJTable;
    // End of variables declaration//GEN-END:variables
}
