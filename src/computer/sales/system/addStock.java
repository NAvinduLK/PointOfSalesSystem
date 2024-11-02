/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer.sales.system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NAvi N Du
 */
public class addStock extends javax.swing.JFrame {

    ResultSet res = null;
    String id;

    /**
     * Creates new form addStock
     */
    public addStock() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        txt3.requestFocus();
        fillCmb();
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
        addStCmb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jButton46 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        addStCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select item name" }));
        addStCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStCmbActionPerformed(evt);
            }
        });
        addStCmb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addStCmbKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add to Stock");
        jLabel1.setToolTipText("");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Select item");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Available in stock");

        txt1.setEditable(false);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Add stock");

        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt3KeyPressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Status");

        txt2.setEditable(false);

        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CSS/img/iconfinder_Save_85542.png"))); // NOI18N
        jButton46.setToolTipText("Add to stock");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CSS/img/delete.png"))); // NOI18N
        jButton4.setToolTipText("Cancal");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txt3)
                            .addComponent(addStCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addStCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed

        if (addStCmb.getSelectedItem().equals("Select item name")) {

            JOptionPane.showMessageDialog(this, "Please select an Item first.");

        } else if (txt3.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Please enter amount of quantity.");

        } else {

            String qty = txt1.getText();
            String add = txt3.getText();
            String val;
            String status;
            int q = Integer.parseInt(qty);
            int a = Integer.parseInt(add);

            try {
                DataOb.dbConnects();

                int tot = q + a;
                val = String.valueOf(tot);

                if (tot == 0) {
                    status = "OUT OF STOCK";
                    txt2.setForeground(Color.red);
                } else if (tot < 10) {
                    status = "LOW STOCK";
                    txt2.setForeground(Color.orange);
                } else {
                    status = "AVAILABLE";
                    txt2.setForeground(Color.green);
                }

                String arrf[] = {"Quantity", "Status"};
                String arrv[] = {val, status};

                DataOb.updateData("jstocktableview", "Item_ID", id, arrf, arrv, "");
                addStCmbActionPerformed(evt);
                new Inventory().upDateStockTable();
                txt3.setText("");
                txt3.requestFocus();

            } catch (Exception ex) {
                Logger.getLogger(addStock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Inventory().upDateStockTable();
        System.out.println("Update table");
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void addStCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStCmbActionPerformed

        String select = addStCmb.getSelectedItem().toString();
        if (select.equals("Select item name")) {
            System.out.println("^_^");
            txt1.setText("");
            txt2.setText("");

        } else {

            try {
                DataOb.dbConnects();
                System.out.println("Database conection success...");
                res = DataOb.viewSelected("jstocktableview", "IName", select);

                if ((res.next())) {
                    id = res.getString("Item_ID");
                    System.out.println(id);

                    txt1.setText(res.getString("Quantity"));

                    txt2.setText(res.getString("status"));
                }

                String s = txt1.getText();
                int t = Integer.parseInt(s);

                if (t == 0) {
                    txt2.setForeground(Color.red);
                } else if (t < 10) {
                    txt2.setForeground(Color.orange);
                } else {
                    txt2.setForeground(Color.green);
                }
                txt3.requestFocus();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }

    }//GEN-LAST:event_addStCmbActionPerformed

    private void txt3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (addStCmb.getSelectedItem().equals("Select item name")) {

                JOptionPane.showMessageDialog(this, "Please select an Item first.");

            } else if (txt3.getText().equals("")) {

                JOptionPane.showMessageDialog(this, "Please enter amount of quantity.");

            } else {

                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    String qty = txt1.getText();
                    String add = txt3.getText();
                    String val;
                    String status;
                    int q = Integer.parseInt(qty);
                    int a = Integer.parseInt(add);

                    try {
                        DataOb.dbConnects();

                        int tot = q + a;
                        val = String.valueOf(tot);

                        if (tot == 0) {
                            status = "OUT OF STOCK";
                            txt2.setForeground(Color.red);
                        } else if (tot < 10) {
                            status = "LOW STOCK";
                            txt2.setForeground(Color.orange);
                        } else {
                            status = "AVAILABLE";
                            txt2.setForeground(Color.green);
                        }

                        String arrf[] = {"Quantity", "Status"};
                        String arrv[] = {val, status};

                        DataOb.updateData("jstocktableview", "Item_ID", id, arrf, arrv, "");
                        addStCmbKeyPressed(evt);
                        new Inventory().upDateStockTable();
                        txt3.setText("");
                        txt3.requestFocus();

                    } catch (Exception ex) {
                        Logger.getLogger(addStock.class
                                .getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_txt3KeyPressed

    private void addStCmbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addStCmbKeyPressed

        String select = addStCmb.getSelectedItem().toString();
        if (select.equals("Select item name")) {
            System.out.println("^_^");
            txt1.setText("");
            txt2.setText("");

        } else {

            try {
                DataOb.dbConnects();
                System.out.println("Database conection success...");
                res = DataOb.viewSelected("jstocktableview", "IName", select);

                if ((res.next())) {
                    id = res.getString("Item_ID");
                    System.out.println(id);

                    txt1.setText(res.getString("Quantity"));

                    txt2.setText(res.getString("status"));
                }

                String s = txt1.getText();
                int t = Integer.parseInt(s);

                if (t == 0) {
                    txt2.setForeground(Color.red);
                } else if (t < 10) {
                    txt2.setForeground(Color.orange);
                } else {
                    txt2.setForeground(Color.green);
                }
                txt3.requestFocus();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }

    }//GEN-LAST:event_addStCmbKeyPressed

    private void fillCmb() {

        String name;
        try {
            DataOb.dbConnects();
            System.out.println("Database connection success...");

            res = DataOb.viewAll("jstocktableview");

            while (res.next()) {
                name = res.getString("IName");
                addStCmb.addItem(name);
            }

        } catch (Exception ex) {
            System.out.println("category combobox has errors! " + ex);

        }

    }

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
            java.util.logging.Logger.getLogger(addStock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStock.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addStCmb;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton46;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
