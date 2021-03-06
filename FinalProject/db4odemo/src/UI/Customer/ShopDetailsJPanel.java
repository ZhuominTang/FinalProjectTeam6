/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.Business.EcoSystem;
import Business.Customer.Order;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Item;
import Business.Enterprise.Store;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerContactRequest;
import Business.WorkQueue.Status;

import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ranranhe
 */
public class ShopDetailsJPanel extends javax.swing.JPanel {

    private EcoSystem system;
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private Store store;

    /**
     * Creates new form RestaurantDetailsJPanel
     */
    public ShopDetailsJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.system = system;

        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.store = (Store) enterprise;
        populateTable();
        this.setSize(650, 475);
        // Review tab
        populateReviewTable();
        populatecustomerContactJTable();
        populateDetail();

    }

    public void populateReviewTable() {
        DefaultTableModel model = (DefaultTableModel) reviewTable.getModel();
        model.setRowCount(0);
        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof Order) {
                if (wr.getSenderMessage() != null) {
                    Object[] row = new Object[3];
                    row[0] = wr.getSender().getUsername();
                    row[1] = wr.dataFormat(wr.getResolveDate());
                    row[2] = wr.getSenderMessage();
                    model.addRow(row);
                }
            }
        }

    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) menuTable.getModel();

        model.setRowCount(0);

        for (Item item : store.getItemDirectory().getItemDirectory()) {
            Object[] row = new Object[2];
            row[0] = item;
            row[1] = item.getUnitPrice();
            model.addRow(row);
        }

    }

    private void populatecustomerContactJTable() {
        DefaultTableModel model = (DefaultTableModel) customerContactJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof CustomerContactRequest) {
                if (((CustomerContactRequest) wr).getEnterprise() == enterprise) {
                    Object[] row = new Object[4];
                    row[0] = wr.getSenderMessage();
                    row[1] = wr.dataFormat(wr.getRequestDate());
                    row[2] = wr.getReceiverMessage();
                    row[3] = (wr.getResolveDate() == null) ? null : wr.dataFormat(wr.getResolveDate());
                    model.addRow(row);
                }
            }
        }
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        StoreLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        reviewTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        customerContactJTable = new javax.swing.JTable();
        messageJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(650, 475));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(650, 475));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 475));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Phone:");

        phoneLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        phoneLabel.setText("<Phone>");

        addressTextArea.setBackground(new java.awt.Color(238, 238, 238));
        addressTextArea.setColumns(20);
        addressTextArea.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        addressTextArea.setLineWrap(true);
        addressTextArea.setBorder(null);
        addressTextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(addressTextArea);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Address: ");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("StoreName:");

        StoreLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        StoreLabel.setText("<Phone>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(StoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(376, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StoreLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneLabel)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Details", jPanel1);

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "UnitPrice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuTable);

        addButton.setText("Place an Order");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(474, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addButton)
                .addGap(133, 133, 133))
        );

        jTabbedPane1.addTab("Menu", jPanel2);

        reviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "SendDate", "Comment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        jScrollPane4.setViewportView(reviewTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );

        jTabbedPane1.addTab("Reviews", jPanel3);

        customerContactJTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Your Message", "SendTime", "Reply", "ReplyTime"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(customerContactJTable);

        messageJTextField.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N

        submitJButton.setFont(new java.awt.Font("??????", 1, 14)); // NOI18N
        submitJButton.setText("Send Message");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Contact", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(new OrderJPanel(userProcessContainer, system, account, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addButtonActionPerformed

    private void reviewTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reviewTableMouseClicked

    }//GEN-LAST:event_reviewTableMouseClicked

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if (messageJTextField.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Input cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        CustomerContactRequest ccr = new CustomerContactRequest();
        ccr.setSender(account);
        ccr.setRequestDate(new Date());
        ccr.setSenderMessage(messageJTextField.getText());
        ccr.setEnterprise(enterprise);
        enterprise.getWorkQueue().getWorkRequestList().add(ccr);
        account.getWorkQueue().getWorkRequestList().add(ccr);
        ccr.setStatus(Status.Waiting);
        JOptionPane.showMessageDialog(this, "The message has been sent!", "Information", JOptionPane.DEFAULT_OPTION);
        populatecustomerContactJTable();
        DB4OUtil.getInstance().storeSystem(system);
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StoreLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JTable customerContactJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable menuTable;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTable reviewTable;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables

    private void populateDetail() {
        StoreLabel.setText(store.getName());
        addressTextArea.setText(store.getAddress());
        phoneLabel.setText(store.getPhoneNumber());
    }
}
