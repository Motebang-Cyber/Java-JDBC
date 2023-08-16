/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.gui;

import java.util.ArrayList;
import vut.Product;
import java.util.ListIterator;
import vut.DataStorageException;
import vut.NotFoundException;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Motebang letseng
 */
public class NigelPharmacyFrame extends javax.swing.JPanel {
    private Product product;
    
    
    private static ArrayList<Product> items = new ArrayList<>();
    ListIterator<Product> listiterator = items.listIterator();
    int k = 0;
    /**
     * Creates new form NigelPharmacyFrame
     */
    public NigelPharmacyFrame() {
        initComponents();
        
        try {
            product.initialise();
            displayOnTextFields(product);
        } catch (DataStorageException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //Method to Display on the textFields
    public void displayOnTextFields(Product count){
            product = new Product();
            NumberFormat cur = NumberFormat.getCurrencyInstance();
            
            try {
                items = product.viewAll();
                txtItemNumber.setText(product.getItemNumber());
                txtItemName.setText(product.getItemName());
                txtPrice.setText(String.valueOf(cur.format(product.getPrice())));
                txtQty.setText(String.valueOf(product.getQty())); 
                txtStockValue.setText(cur.format(String.valueOf(product.getPrice() * product.getQty())));
            } catch (NotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
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

        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        txtItemName = new javax.swing.JTextField();
        txtItemNumber = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtStockValue = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        btnSpecials = new javax.swing.JButton();
        btnOutofStock = new javax.swing.JButton();
        btnReplenish = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSpecials = new javax.swing.JTextArea();

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnSpecials.setText("List Specials");
        btnSpecials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpecialsActionPerformed(evt);
            }
        });

        btnOutofStock.setText("Out of Stock");
        btnOutofStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutofStockActionPerformed(evt);
            }
        });

        btnReplenish.setText("Replenish");
        btnReplenish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplenishActionPerformed(evt);
            }
        });

        taSpecials.setColumns(20);
        taSpecials.setRows(5);
        jScrollPane1.setViewportView(taSpecials);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStockValue, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtItemNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSpecials)
                            .addComponent(btnOutofStock)
                            .addComponent(btnReplenish))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(txtItemNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtStockValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSpecials)
                        .addGap(11, 11, 11)
                        .addComponent(btnOutofStock)
                        .addGap(18, 18, 18)
                        .addComponent(btnReplenish))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        if (listiterator.hasPrevious()){
            Product count = listiterator.previous();
            displayOnTextFields(count);
        }else{
            JOptionPane.showMessageDialog(null, "Reached the begining od list");
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnReplenishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplenishActionPerformed
        // TODO add your handling code here:
        try {
            int qty = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity"));
            String itemNumber = JOptionPane.showInputDialog("Enter ItemName");
            product.replenish(qty, itemNumber);
        } catch (NotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnReplenishActionPerformed

    private void btnOutofStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutofStockActionPerformed
        // TODO add your handling code here:
        try {
            taSpecials.append(product.viewOutofStockItems().toString());
        } catch (NotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnOutofStockActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        if (listiterator.hasNext()){
            Product count = listiterator.next();
            displayOnTextFields(count);
        }else{
            JOptionPane.showMessageDialog(null, "Reached the end of List");
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSpecialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpecialsActionPerformed
        // TODO add your handling code here:
            String name = product.getItemName();
            if (product.getItemName().startsWith("*")){
                taSpecials.append(product.getItemName().substring(name.charAt(0)));
            }
        
    }//GEN-LAST:event_btnSpecialsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOutofStock;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnReplenish;
    private javax.swing.JButton btnSpecials;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taSpecials;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemNumber;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtStockValue;
    // End of variables declaration//GEN-END:variables
}