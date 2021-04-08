/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdmin;

import Business.Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.SysServicePersonnelRole;
import Business.UserAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tzm
 */
public class SysAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    private JFrame frame;

    public SysAdminJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, JFrame frame) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.frame = frame;
        this.setSize(900, 640);
        populateServicePersonnelJTable();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        servicePersonnelJTable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        txtEmployeeFirstName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        btnSubmit1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        lblName1 = new javax.swing.JLabel();
        txtEmployeeLastName = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 931, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Overview", jPanel1);

        servicePersonnelJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "UserName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(servicePersonnelJTable);

        btnDelete.setFont(new java.awt.Font("宋体", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtEmployeeFirstName.setFont(new java.awt.Font("宋体", 0, 12)); // NOI18N

        lblName.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        lblName.setText("EmployeeFirstName:");

        btnSubmit1.setFont(new java.awt.Font("宋体", 1, 12)); // NOI18N
        btnSubmit1.setText("Submit");
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel8.setText("UserName:");

        userNameTextField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel9.setText("Password:");

        passwordJPasswordField.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N

        lblName1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        lblName1.setText("EmployeeLastName:");

        txtEmployeeLastName.setFont(new java.awt.Font("宋体", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmployeeLastName)
                                    .addComponent(txtEmployeeFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(userNameTextField)
                                    .addComponent(passwordJPasswordField))
                                .addGap(200, 200, 200))
                            .addComponent(btnSubmit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblName1))
                .addGap(148, 148, 148))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtEmployeeFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName1)
                    .addComponent(txtEmployeeLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Manage Service personnel", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed

        String firstName = txtEmployeeFirstName.getText();
        String lastName = txtEmployeeLastName.getText();
        String userName = userNameTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        if (firstName.trim().equals("") || lastName.trim().equals("") || userName.trim().equals("") || password.trim().equals("")) {

            JOptionPane.showMessageDialog(this, "Input cannot be empty", "Warning", JOptionPane.WARNING_MESSAGE);
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
        UserAccount uss = new UserAccount();
        uss.setUsername(userName);
        uss.setPassword(password);
        uss.setRole(new SysServicePersonnelRole());
        Employee emp = new Employee();
        emp.setFirstName(firstName);
        emp.setLastName(lastName);
        uss.setPerson(emp);
        system.getEmployeeDirectory().getEmployeeList().add(emp);
        system.getUserAccountDirectory().getUserAccountList().add(uss);
        txtEmployeeFirstName.setText("");
        txtEmployeeLastName.setText("");
        userNameTextField.setText("");
        passwordJPasswordField.setText("");
        populateServicePersonnelJTable();
    }//GEN-LAST:event_btnSubmit1ActionPerformed
    private void populateServicePersonnelJTable() {
        DefaultTableModel model = (DefaultTableModel) servicePersonnelJTable.getModel();

        model.setRowCount(0);

        for (UserAccount acc : system.getUserAccountDirectory().getUserAccountList()) {
            if (acc.getRole() instanceof SysServicePersonnelRole) {
                Object[] row = new Object[2];
                row[0] = acc.getPerson().returnFullName();
                row[1] = acc;
                model.addRow(row);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JTable servicePersonnelJTable;
    private javax.swing.JTextField txtEmployeeFirstName;
    private javax.swing.JTextField txtEmployeeLastName;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
