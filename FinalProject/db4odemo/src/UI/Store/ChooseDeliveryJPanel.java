/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Store;

import Business.Business.EcoSystem;
import Business.Customer.Customer;
import Business.Customer.Order;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.DeliveryAgent;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Store;
import Business.WorkQueue.ShippingOrder;
import Business.WorkQueue.Status;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 10643
 */
public class ChooseDeliveryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChooseDeliveryJPanel
     */
    private EcoSystem system;
    private JPanel panel;
    private JPanel ChooseDeliveryCompanyPanel;
    private Store store;
    private Order order;

    public ChooseDeliveryJPanel(EcoSystem system, JPanel panel, JPanel ChooseDeliveryCompanyPanel, Store store, Order order) {
        initComponents();
        this.system = system;
        this.panel = panel;
        this.ChooseDeliveryCompanyPanel = ChooseDeliveryCompanyPanel;
        this.store = store;
        this.order = order;
        populateDeliveryCompanyjTable1();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        DeliveryCompanyjTable1 = new javax.swing.JTable();
        ConfirmjButton = new javax.swing.JButton();
        CanceljButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel1.setText("Choose Delivery Agent:");

        DeliveryCompanyjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Delivery Company Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DeliveryCompanyjTable1);

        ConfirmjButton.setText("Confirm");
        ConfirmjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmjButtonActionPerformed(evt);
            }
        });

        CanceljButton.setText("Cancel");
        CanceljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanceljButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(ConfirmjButton)
                                .addGap(66, 66, 66)
                                .addComponent(CanceljButton)))
                        .addGap(34, 34, 34)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmjButton)
                    .addComponent(CanceljButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CanceljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanceljButtonActionPerformed
        ChooseDeliveryCompanyPanel.remove(this);
        CardLayout layout = (CardLayout) ChooseDeliveryCompanyPanel.getLayout();
        layout.previous(ChooseDeliveryCompanyPanel);
    }//GEN-LAST:event_CanceljButtonActionPerformed

    private void ConfirmjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmjButtonActionPerformed
        if (DeliveryCompanyjTable1.getSelectedRow() >= 0) {
            DeliveryAgent da = (DeliveryAgent) DeliveryCompanyjTable1.getValueAt(DeliveryCompanyjTable1.getSelectedRow(), 0);
            
            ShippingOrder so = new ShippingOrder();
            so.setOrder(order);
            so.setStoreEnterprise(store);
            so.setDaEnterprise(da);
            so.setStatus(Status.Waiting);
            so.setRequestDate(new Date());
            so.setCustomerAddress(((Customer) order.getSender().getPerson()).getAddress());
            so.setCustomerPhone(((Customer) order.getSender().getPerson()).getPhone());
            so.setStoreAddress(store.getAddress());
            so.setStorePhone(store.getPhoneNumber());
            
            order.setShippingOrder(so);
            da.getWorkQueue().getWorkRequestList().add(so);
            order.setDeliveryAgentName(da.getName());
            StoreDistributionPersonnelJPanel p = (StoreDistributionPersonnelJPanel) panel;
            
             p.populateorderTable();
            DB4OUtil.getInstance().storeSystem(system);
            JOptionPane.showMessageDialog(this, "The shippingorder has been sent, please wait for the delivery agent's response!", "Information", JOptionPane.DEFAULT_OPTION);
            ChooseDeliveryCompanyPanel.remove(this);
            
        } else {
            JOptionPane.showMessageDialog(null, "Please select a delivery company");
        }
    }//GEN-LAST:event_ConfirmjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CanceljButton;
    private javax.swing.JButton ConfirmjButton;
    private javax.swing.JTable DeliveryCompanyjTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateDeliveryCompanyjTable1() {
        DefaultTableModel model = (DefaultTableModel) DeliveryCompanyjTable1.getModel();
        model.setRowCount(0);
        for (Enterprise e : system.getEnterpriseDirectory().getEnterpriseList()) {
            if (e instanceof DeliveryAgent) {
                DeliveryAgent da = (DeliveryAgent) e;
                Object[] row = new Object[1];
                row[0] = da;
                model.addRow(row);
            }
        }
    }
}
