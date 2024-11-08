/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer.sales.system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NAvi N Du
 */
public class OrderLeger extends javax.swing.JFrame {

    ResultSet res = null;
    String dbOrder = "orders", dbOrderIL = "orders_itemlist";
    String id = "", supp_Id = "", supplyer = "";
    int ol_listRowCount = 0;

    /**
     * Creates new form OrderLeger
     */
    public OrderLeger() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        upDateOrderTable();
        dateCmbFill();
        suppCmbFill();
        ol_lblTypes.setText("Ordered item types : " + ol_listRowCount);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ol_orderId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ol_supp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ol_date = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ol_datecmb = new javax.swing.JComboBox<>();
        ol_suppCmb = new javax.swing.JComboBox<>();
        jButton36 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        ol_lblTypes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ol_orders = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ol_orderItems = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Orders Leger");

        ol_orderId.setEditable(false);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Order ID");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Supplyer name");

        ol_supp.setEditable(false);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Date");

        ol_date.setEditable(false);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Search by Supplyer");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Search by Date");

        ol_datecmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Date" }));
        ol_datecmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ol_datecmbActionPerformed(evt);
            }
        });

        ol_suppCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Supplyer" }));
        ol_suppCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ol_suppCmbActionPerformed(evt);
            }
        });

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CSS/img/delete.png"))); // NOI18N
        jButton36.setToolTipText("Delete all");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CSS/img/iconfinder_edit-clear_118917.png"))); // NOI18N
        jButton19.setToolTipText("Clear");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        ol_lblTypes.setText("Ordered item types : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ol_suppCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ol_datecmb, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ol_date, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ol_supp, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(167, 167, 167)
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ol_orderId, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ol_lblTypes)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ol_datecmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ol_orderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ol_lblTypes))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ol_supp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ol_suppCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ol_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        ol_orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order_ID", "Supplyer ID", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ol_orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ol_ordersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ol_orders);

        ol_orderItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Quantity"
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
        jScrollPane2.setViewportView(ol_orderItems);
        if (ol_orderItems.getColumnModel().getColumnCount() > 0) {
            ol_orderItems.getColumnModel().getColumn(0).setMaxWidth(500);
            ol_orderItems.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Items table");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Orders table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ol_ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ol_ordersMouseClicked

        DefaultTableModel olRecode = (DefaultTableModel) ol_orders.getModel();
        int selectRow = ol_orders.getSelectedRow();

        id = ol_orders.getValueAt(selectRow, 0).toString();

        try {
            
//            supp_Id = ol_orders.getValueAt(selectRow, 1).toString();
            

            DataOb.dbConnects();
            System.out.println("Database connection succussfull.");

            res = DataOb.viewSelected(dbOrder, "Order_ID", id);
            if (res.next()){
                supp_Id = res.getString("Sup_ID");
            }
            
            res = DataOb.viewSelected("supplyers", "Sup_ID", supp_Id);
            if (res.next()) {
                ol_supp.setForeground(Color.black);
                supplyer = res.getString("SName");
                                
            } else {
                ol_supp.setForeground(Color.red);
                supplyer = "Supplyer not Availble!";
            }

            ol_orderId.setText(id);
            ol_supp.setText(supplyer);
            ol_date.setText(ol_orders.getValueAt(selectRow, 2).toString());

            addDataFromOrdertable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }


    }//GEN-LAST:event_ol_ordersMouseClicked

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed

        DefaultTableModel orderLiRecord = (DefaultTableModel) ol_orderItems.getModel();
        orderLiRecord.setRowCount(0);

        ol_orderId.setText("");
        ol_supp.setText("");
        ol_date.setText("");
        ol_datecmb.setSelectedIndex(0);
        ol_suppCmb.setSelectedIndex(0);
        ol_listRowCount = 0;
        ol_lblTypes.setText("Ordered item types : " + ol_listRowCount);

    }//GEN-LAST:event_jButton19ActionPerformed

    private void ol_suppCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ol_suppCmbActionPerformed
        searchOrderTable();
    }//GEN-LAST:event_ol_suppCmbActionPerformed

    private void ol_datecmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ol_datecmbActionPerformed
        searchOrderTable();
    }//GEN-LAST:event_ol_datecmbActionPerformed
//###################################################################################################################################################

    public void dateCmbFill() {

        try {
            DataOb.dbConnects();
            System.out.println("Database connection success...");
            res = DataOb.viewAll("orders");

            while (res.next()) {
                String date = res.getString("Odate");
                ol_datecmb.addItem(date);
            }

        } catch (Exception ex) {
            System.out.println(ex);

        }

    }

    public void suppCmbFill() {
        String suppName = "";
        try {
            DataOb.dbConnects();
            System.out.println("Database connection success...");
            res = DataOb.viewAll("supplyers");

            while (res.next()) {
                suppName = res.getString("SName");

                ol_suppCmb.addItem(suppName);
            }

        } catch (Exception ex) {
            System.out.println(ex);

        }

    }

    public void addDataFromOrdertable() {

//        String[] arrProperty = {"IName", "o_qty"};
        try {
            DataOb.dbConnects();
            System.out.println("Database connection success...");

            res = DataOb.viewSelected(dbOrderIL, "Order_ID", id);
            ResultSetMetaData stData = res.getMetaData();

            int qcount = stData.getColumnCount();

            DefaultTableModel orderLiRecord = (DefaultTableModel) ol_orderItems.getModel();
            orderLiRecord.setRowCount(0);

            while (res.next()) {
                Vector columnData = new Vector();

                for (int i = 1; i <= qcount; i++) {
                    columnData.add(res.getString("IName"));
                    columnData.add(res.getString("o_qty"));
                }
                orderLiRecord.addRow(columnData);
            }

            ol_listRowCount = orderLiRecord.getRowCount();

            ol_lblTypes.setText("Ordered item types : " + ol_listRowCount);

        } catch (Exception e) {
        }

    }

    public void upDateOrderTable() {

        String[] arrProperty = {"Order_ID", "Sup_ID", "Odate"};

        try {
            DataOb.dbConnects();
            System.out.println("Database connection success...");

            res = DataOb.selectedField(dbOrder, arrProperty, "", "", "");
            ResultSetMetaData stData = res.getMetaData();

            int qcount = stData.getColumnCount();

            DefaultTableModel orderRecord = (DefaultTableModel) ol_orders.getModel();
            orderRecord.setRowCount(0);

            while (res.next()) {
                Vector columnData = new Vector();

                for (int i = 1; i <= qcount; i++) {
                    columnData.add(res.getString("Order_ID"));
                    columnData.add(res.getString("Sup_ID"));
                    columnData.add(res.getString("Odate"));
                }
                orderRecord.addRow(columnData);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void searchOrderTable() {

        if (ol_datecmb.getSelectedItem().equals("Select Date")) {

            if (ol_suppCmb.getSelectedItem().equals("Select Supplyer")) {
                upDateOrderTable();
            } else {
                //update by supplyer
                String supp = ol_suppCmb.getSelectedItem().toString();

                try {
                    DataOb.dbConnects();
                    System.out.println("Database connection successfull.");

                    res = DataOb.viewSelected("supplyers", "SName", supp);
                    if (res.next()) {
                        String sup_id = res.getString("Sup_ID");

                        res = DataOb.viewSelected(dbOrder, "Sup_ID", sup_id);
                        ResultSetMetaData stData = res.getMetaData();

                        int qcount = stData.getColumnCount();

                        DefaultTableModel orderRecord = (DefaultTableModel) ol_orders.getModel();
                        orderRecord.setRowCount(0);

                        while (res.next()) {
                            Vector columnData = new Vector();

                            for (int i = 1; i <= qcount; i++) {
                                columnData.add(res.getString("Order_ID"));
                                columnData.add(res.getString("Sup_ID"));
                                columnData.add(res.getString("Odate"));
                            }
                            orderRecord.addRow(columnData);
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e);
                }
            }

        } else if (ol_suppCmb.getSelectedItem().equals("Select Supplyer")) {
            //update by date
            String date = ol_datecmb.getSelectedItem().toString();

            try {
                DataOb.dbConnects();
                System.out.println("Database connection successfull.");

                res = DataOb.viewSelected(dbOrder, "Odate", date);
                ResultSetMetaData stData = res.getMetaData();

                int qcount = stData.getColumnCount();

                DefaultTableModel orderRecord = (DefaultTableModel) ol_orders.getModel();
                orderRecord.setRowCount(0);

                while (res.next()) {
                    Vector columnData = new Vector();

                    for (int i = 1; i <= qcount; i++) {
                        columnData.add(res.getString("Order_ID"));
                        columnData.add(res.getString("Sup_ID"));
                        columnData.add(res.getString("Odate"));
                    }
                    orderRecord.addRow(columnData);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

        } else {
            //update by date & supplyer
            //dataob ekata & dala methrd ekk hdnna select * from tname where supplyer = value and date = value
            String supp = ol_suppCmb.getSelectedItem().toString();
            String date = ol_datecmb.getSelectedItem().toString();

            try {
                DataOb.dbConnects();
                System.out.println("Database connection successfull.");

                res = DataOb.viewSelected("supplyers", "SName", supp);
                if (res.next()) {
                    String sup_id = res.getString("Sup_ID");

                    res = DataOb.andView2columns(dbOrder, "Odate", date, "Sup_ID", sup_id);
                    ResultSetMetaData stData = res.getMetaData();

                    int qcount = stData.getColumnCount();

                    DefaultTableModel orderRecord = (DefaultTableModel) ol_orders.getModel();
                    orderRecord.setRowCount(0);

                    while (res.next()) {
                        Vector columnData = new Vector();

                        for (int i = 1; i <= qcount; i++) {
                            columnData.add(res.getString("Order_ID"));
                            columnData.add(res.getString("Sup_ID"));
                            columnData.add(res.getString("Odate"));
                        }
                        orderRecord.addRow(columnData);
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }

        }

    }

//#####################################################################################################################################################
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
            java.util.logging.Logger.getLogger(OrderLeger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderLeger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderLeger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderLeger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderLeger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton36;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField ol_date;
    private javax.swing.JComboBox<String> ol_datecmb;
    private javax.swing.JLabel ol_lblTypes;
    private javax.swing.JTextField ol_orderId;
    private javax.swing.JTable ol_orderItems;
    private javax.swing.JTable ol_orders;
    private javax.swing.JTextField ol_supp;
    private javax.swing.JComboBox<String> ol_suppCmb;
    // End of variables declaration//GEN-END:variables
}
