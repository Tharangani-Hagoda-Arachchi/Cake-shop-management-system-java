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
public class Bill extends javax.swing.JFrame {

    /**
     * Creates new form Bill
     */
    public Bill() {
        initComponents();
    }
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCus = new javax.swing.JTable();
        jButtonViewpro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableOrder = new javax.swing.JTable();
        jButtonViewCus = new javax.swing.JButton();
        jLabelCusId = new javax.swing.JLabel();
        jTextFieldCusId = new javax.swing.JTextField();
        jTextFieldPName = new javax.swing.JTextField();
        jTextFieldQun = new javax.swing.JTextField();
        jTextFieldOid = new javax.swing.JTextField();
        jTextFieldDate = new javax.swing.JTextField();
        jLabelItemName = new javax.swing.JLabel();
        jLabelOrderId = new javax.swing.JLabel();
        jLabelQuantity = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePro = new javax.swing.JTable();
        jButtonInsert = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 43, 87));

        jTableCus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Telephone", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTableCus);

        jButtonViewpro.setBackground(new java.awt.Color(102, 102, 0));
        jButtonViewpro.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButtonViewpro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViewpro.setText("View Product Detail");
        jButtonViewpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewproActionPerformed(evt);
            }
        });

        jTableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "orderId", "customer id", "product Name", "Quantity", "date"
            }
        ));
        jScrollPane2.setViewportView(jTableOrder);

        jButtonViewCus.setBackground(new java.awt.Color(102, 102, 0));
        jButtonViewCus.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButtonViewCus.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViewCus.setText("View Customer Detail");
        jButtonViewCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewCusActionPerformed(evt);
            }
        });

        jLabelCusId.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelCusId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCusId.setText("Customer ID");

        jLabelItemName.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelItemName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelItemName.setText("Item Name ");

        jLabelOrderId.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelOrderId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOrderId.setText("Order ID");

        jLabelQuantity.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelQuantity.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuantity.setText("Quantity");

        jLabelDate.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDate.setText("Order date");

        jTablePro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "category", "name", "quantity", "price", "description"
            }
        ));
        jScrollPane3.setViewportView(jTablePro);

        jButtonInsert.setBackground(new java.awt.Color(0, 102, 0));
        jButtonInsert.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInsert.setText("INSERT");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(255, 153, 0));
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("CLEAR");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonView.setBackground(new java.awt.Color(102, 102, 0));
        jButtonView.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButtonView.setForeground(new java.awt.Color(255, 255, 255));
        jButtonView.setText("View ");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButtonViewpro, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDate)
                                    .addComponent(jLabelCusId)
                                    .addComponent(jLabelQuantity)
                                    .addComponent(jLabelItemName)
                                    .addComponent(jLabelOrderId))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldQun)
                                    .addComponent(jTextFieldCusId)
                                    .addComponent(jTextFieldPName)
                                    .addComponent(jTextFieldDate)
                                    .addComponent(jTextFieldOid)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))))
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addComponent(jButtonViewCus, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(609, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(475, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCusId)
                            .addComponent(jTextFieldCusId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldOid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelOrderId))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelItemName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQuantity))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDate)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonView)
                    .addComponent(jButtonInsert))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonViewpro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(jButtonViewCus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(350, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(338, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(78, 78, 78)))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            
            Class.forName(JDBC_DRIVER);

         
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            sta = con.createStatement();
            String sql = "SELECT * FROM order_detail";
           
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
                jTableOrder.setModel(dtm);
                
                

               
               
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
    
    private void jButtonViewproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewproActionPerformed
        // TODO add your handling code here:

            Connection con = null;
        Statement sta = null;

        try {
            
            Class.forName(JDBC_DRIVER);

         
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
                jTablePro.setModel(dtm);
                
                

               
               
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

    }//GEN-LAST:event_jButtonViewproActionPerformed

    private void jButtonViewCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewCusActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        Statement sta = null;

        try {
            
            Class.forName(JDBC_DRIVER);

         
            con = DriverManager.getConnection(DB_URL, USER, PASS);

            sta = con.createStatement();
            String sql = "SELECT * FROM customer_detail";
           
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
                jTableCus.setModel(dtm);
                
                

               
               
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
    }//GEN-LAST:event_jButtonViewCusActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        Connection con = null;
        PreparedStatement pst = null;

        if(jTextFieldCusId.getText().equals("")){
            JOptionPane.showMessageDialog(null,"PLEASE ENTER CUSTOMER ID");}

        else if(jTextFieldOid.getText().equals("")){
            JOptionPane.showMessageDialog(null,"PLEASE ENTER Order Id");}

        else if(jTextFieldPName.getText().equals("")){
            JOptionPane.showMessageDialog(null,"PLEASE ENTER CUStOMER Product name");}
        else if(jTextFieldQun.getText().equals("")){
            JOptionPane.showMessageDialog(null,"PLEASE ENTER Quantity");}
        else if(jTextFieldDate.getText().equals("")){
            JOptionPane.showMessageDialog(null,"PLEASE ENTER date");}


        else{
            try {

                Class.forName(JDBC_DRIVER);
                con = DriverManager.getConnection(DB_URL, USER, PASS);
                String query = "INSERT INTO order_detail(order_id,cus_id,pro_name,quantity,date) VALUES (?,?,?,?,?)";
                pst = (PreparedStatement) con.prepareStatement(query);

                 pst.setInt(1, Integer.parseInt(jTextFieldOid.getText()));
                pst.setInt(2, Integer.parseInt(jTextFieldCusId.getText()));
                pst.setString(3, jTextFieldPName.getText());
                pst.setDouble(4, Double.parseDouble(jTextFieldQun.getText()));
                pst.setString(5, jTextFieldDate.getText());
                int res = pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"DATA ADDED SUCESSFULLY");
                updateTable();

                jTextFieldCusId.setText("");
                jTextFieldOid.setText("");
                jTextFieldPName.setText("");
                jTextFieldDate.setText("");
                jTextFieldQun.setText("");

            } catch (SQLException ex) {

                ex.printStackTrace();
            } catch (Exception ex) {

                ex.printStackTrace();
            } finally {

                try {
                    if (pst != null) {
                        pst.close();

                    }
                } catch (SQLException se2) {

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
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        jTextFieldCusId.setText("");
        jTextFieldOid.setText("");
        jTextFieldPName.setText("");
        jTextFieldQun.setText("");
        jTextFieldDate.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:

        updateTable();
    }//GEN-LAST:event_jButtonViewActionPerformed

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonView;
    private javax.swing.JButton jButtonViewCus;
    private javax.swing.JButton jButtonViewpro;
    private javax.swing.JLabel jLabelCusId;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelItemName;
    private javax.swing.JLabel jLabelOrderId;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableCus;
    private javax.swing.JTable jTableOrder;
    private javax.swing.JTable jTablePro;
    private javax.swing.JTextField jTextFieldCusId;
    private javax.swing.JTextField jTextFieldDate;
    private javax.swing.JTextField jTextFieldOid;
    private javax.swing.JTextField jTextFieldPName;
    private javax.swing.JTextField jTextFieldQun;
    // End of variables declaration//GEN-END:variables
}
