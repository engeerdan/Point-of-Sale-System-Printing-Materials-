/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import main.itemManDBP;
import main.itemManipulation;
import main.searchDBP;

/**
 *
 * @author engeer
 */
public class InventoryUpdateFrame extends javax.swing.JFrame {
    JTable InventorySearchedListTable;
    /**
     * Creates new form InventoryUpdateFrame
     */
    public InventoryUpdateFrame(itemManipulation iv, JTable InventorySearchedListTable) {
        initComponents();
        Add_Button.setVisible(false);
        this.InventorySearchedListTable = InventorySearchedListTable;
        this.setLocationRelativeTo(null);
        ItemSerialNo_jTextField.setText( String.valueOf(iv.getItem_serial()));
        Gentype_jTextField.setText(String.valueOf(iv.getG_type()));
        subtype_jTextField4.setText(String.valueOf(iv.getS_type()));
        item_name_jTextField3.setText(String.valueOf(iv.getItem_name()));
        stock_jTextField8.setText(String.valueOf(iv.getStock()));
        price_jTextField5.setText(String.valueOf(iv.getPrice()));
        wholesalejTextField7.setText(String.valueOf(iv.getw_price()));
        expiry_textfield.setText(String.valueOf(iv.getExpiry()));
    }
    public InventoryUpdateFrame() {
        initComponents();
    }
    public InventoryUpdateFrame( int a) {
        initComponents();
        Add_Button.setVisible(true);
        update_jButton1.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        ItemSerialNo_jTextField = new javax.swing.JTextField();
        Expiry = new javax.swing.JLabel();
        expiry_textfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Gentype_jTextField = new javax.swing.JTextField();
        wholesalejTextField7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stock_jTextField8 = new javax.swing.JTextField();
        item_name_jTextField3 = new javax.swing.JTextField();
        update_jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Cancel_jButton = new javax.swing.JButton();
        subtype_jTextField4 = new javax.swing.JTextField();
        price_jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Add_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Price");

        Expiry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Expiry.setText("Expiry");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Wholesale");

        Gentype_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gentype_jTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Gen Type");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Stock Total");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Item Name");

        stock_jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_jTextField8ActionPerformed(evt);
            }
        });

        update_jButton1.setText("Update");
        update_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Sub Type");

        Cancel_jButton.setText("Cancel");
        Cancel_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_jButtonActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Item Serial no.");

        Add_Button.setText("Add");
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(update_jButton1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Expiry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(expiry_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wholesalejTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(price_jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stock_jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(item_name_jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subtype_jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Gentype_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ItemSerialNo_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Add_Button)
                        .addGap(18, 18, 18)
                        .addComponent(Cancel_jButton)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemSerialNo_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gentype_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtype_jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_name_jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stock_jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price_jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wholesalejTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Expiry, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expiry_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_jButton1)
                    .addComponent(Cancel_jButton)
                    .addComponent(Add_Button))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Gentype_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gentype_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gentype_jTextFieldActionPerformed

    private void stock_jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stock_jTextField8ActionPerformed

    private void Cancel_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_jButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Cancel_jButtonActionPerformed

    private void update_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_jButton1ActionPerformed

        itemManipulation av = new itemManipulation();
        
        av.setItem_serial(Integer.valueOf(ItemSerialNo_jTextField.getText()));
        av.setG_type(Gentype_jTextField.getText());
        av.setS_type(subtype_jTextField4.getText());
        av.setItem_name(item_name_jTextField3.getText());
        av.setQty(Integer.valueOf(stock_jTextField8.getText()));
        av.setPrice(Float.valueOf(price_jTextField5.getText()));
        av.setw_price(Float.valueOf(wholesalejTextField7.getText()));
        av.setExpiry(expiry_textfield.getText());
            
        itemManDBP db = new itemManDBP();
        if (db.updateInventory(av)){
            JOptionPane.showMessageDialog(null, "Update Complete. "
                                    + "Inventory update successful", 
                                    "", JOptionPane.INFORMATION_MESSAGE);
            searchDBP a = new searchDBP();
            

        // Clear table
            a.clearTable(InventorySearchedListTable);
            dispose();
            
        }else{
        
        }
        
    }//GEN-LAST:event_update_jButton1ActionPerformed

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed
        // TODO add your handling code here:
        itemManipulation av = new itemManipulation();
        try{
        av.setItem_serial(Integer.valueOf(ItemSerialNo_jTextField.getText()));
        av.setG_type(Gentype_jTextField.getText());
        av.setS_type(subtype_jTextField4.getText());
        av.setItem_name(item_name_jTextField3.getText());
        av.setQty(Integer.valueOf(stock_jTextField8.getText()));
        av.setPrice(Float.valueOf(price_jTextField5.getText()));
        av.setw_price(Float.valueOf(wholesalejTextField7.getText()));
        av.setExpiry(expiry_textfield.getText());
        itemManDBP db = new itemManDBP();
        if (db.updateAddInventory(av)){
            JOptionPane.showMessageDialog(null, "Update Complete. "
                                    + "Inventory update successful", 
                                    "", JOptionPane.INFORMATION_MESSAGE);

            dispose();
            
        }else{
        
        }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Problem input. "
                                    + "Missing or Wrong type of input", 
                                    "", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_Add_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JButton Cancel_jButton;
    private javax.swing.JLabel Expiry;
    private javax.swing.JTextField Gentype_jTextField;
    public javax.swing.JTextField ItemSerialNo_jTextField;
    private javax.swing.JTextField expiry_textfield;
    private javax.swing.JTextField item_name_jTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField price_jTextField5;
    private javax.swing.JTextField stock_jTextField8;
    private javax.swing.JTextField subtype_jTextField4;
    private javax.swing.JButton update_jButton1;
    private javax.swing.JTextField wholesalejTextField7;
    // End of variables declaration//GEN-END:variables
}
