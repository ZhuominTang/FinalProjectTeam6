/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Business.Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import javax.swing.JPanel;

/**
 *
 * @author tzm
 */
public class RgtSJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RgtSJPanel
     */
    private EcoSystem system;
    private JPanel loginJPanel;

    private DB4OUtil dB4OUtil;

    /**
     * Creates new form LoginJPanel
     */
    public RgtSJPanel(EcoSystem system, JPanel loginJPanel, DB4OUtil dB4OUtil) {
        initComponents();
        this.system = system;
        this.loginJPanel = loginJPanel;
        this.dB4OUtil = dB4OUtil;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
