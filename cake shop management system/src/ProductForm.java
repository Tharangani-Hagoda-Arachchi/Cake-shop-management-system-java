/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.*;
public class ProductForm extends javax.swing.JFrame {

    /**
     * Creates new form ProductForm
     */
    public ProductForm() {
        initComponents();
    }
    
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/cakeshop";
    static final String USER = "root";
    static final String PASS = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonRemove = new javax.swing.JButton();
        jButtonAdd1 = new javax.swing.JButton();
        jTextFieldsearch = new javax.swing.JTextField();
        jButtonEdit1 = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProduct = new javax.swing.JTable();
        jButtonView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(22, 11, 66));

        jButtonRemove.setBackground(new java.awt.Color(153, 0, 0));
        jButtonRemove.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButtonRemove.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemove.setText("Remove Selected Product");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jButtonAdd1.setBackground(new java.awt.Color(0, 102, 0));
        jButtonAdd1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButtonAdd1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd1.setText("Add New Product");
        jButtonAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdd1ActionPerformed(evt);
            }
        });

        jButtonEdit1.setBackground(new java.awt.Color(0, 51, 255));
        jButtonEdit1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButtonEdit1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEdit1.setText("Edit Selected Product");
        jButtonEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEdit1ActionPerformed(evt);
            }
        });

        jButtonSearch.setText("Search");

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        TableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "category", "Name", "Quantity", "Price", "Description"
            }
        ));
        jScrollPane1.setViewportView(TableProduct);

        jButtonView.setBackground(new java.awt.Color(102, 102, 0));
        jButtonView.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButtonView.setForeground(new java.awt.Color(255, 255, 255));
        jButtonView.setText("View Product");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jTextFieldsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSearch))
                    .addComponent(jButtonRefresh))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButtonAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
      void updateTable(){
    Connection con = null;
        Statement sta = null;

        try {
            
            Class.forName(DRIVER);

         
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            sta = con.createStatement();
            String sql = "SELECT * FROM product_detail";
           
            ResultSet rs = sta.executeQuery(sql);
            ResultSetMetaData rsmetadata=rs.getMetaData();
            int columns=rsmetadata.getColumnCount();
            DefaultTableModel dtm=new DefaultTableModel();
            Vector columns_name= new Vector();
            Vector data_raws=new Vector();
            
            for(int i=1; i<=columns; i++){
                columns_name.addElement(rsmetadata.getColumnName(i));
           
            }
            dtm.setColumnIdentifiers(columns_name);

           
            while (rs.next()) {
                data_raws=new Vector();
                for(int j=1; j<=columns;j++){
                    data_raws.addElement(rs.getString(j));
                
                }
                dtm.addRow(data_raws);
                TableProduct.setModel(dtm);
                
                

               
               
            }

           
            rs.close();

        } catch (SQLException ex) {
            
            ex.printStackTrace();
        } catch (Exception ex) {
            
            ex.printStackTrace();
        } finally {
            
            try {
                if (sta != null) {
                    sta.close();
                  
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            try {
                if (con != null) {
                    con.close();
                    
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    
    }
    private void jButtonAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdd1ActionPerformed
        // TODO add your handling code here:
        new AddProductForm().setVisible(true);
    }//GEN-LAST:event_jButtonAdd1ActionPerformed

    private void jButtonEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEdit1ActionPerformed
        // TODO add your handling code here:
        new EditProductFrom().setVisible(true);
    }//GEN-LAST:event_jButtonEdit1ActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
        updateTable();
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // TODO add your handling code here:
        
       if (TableProduct.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(null,"Please Select Item to delete");
          
        }
        else{
        int row=TableProduct.getSelectedRow();
        String cell=TableProduct.getModel().getValueAt(row, 0).toString();
        
    

        Connection con = null;
        PreparedStatement sta = null;

        try {
            
            Class.forName(DRIVER);

         
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            
            String sql = "DELETE FROM product_detail WHERE pro_id= " +cell;
            sta = (PreparedStatement) con.prepareStatement(sql);
           
             sta.execute();
             JOptionPane.showMessageDialog(null,"sucssesfuly Delceted");
             
             updateTable();

           
            

               
               
           

        } catch (SQLException ex) {
            
            ex.printStackTrace();
        } catch (Exception ex) {
            
            ex.printStackTrace();
        } finally {
            
            try {
                if (sta != null) {
                    sta.close();
                  
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            try {
                if (con != null) {
                    con.close();
                    
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        }
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        // TODO add your handling code here:
        updateTable();
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableProduct;
    private javax.swing.JButton jButtonAdd1;
    private javax.swing.JButton jButtonEdit1;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldsearch;
    // End of variables declaration//GEN-END:variables
}