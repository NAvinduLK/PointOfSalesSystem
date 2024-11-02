/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer.sales.system;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author NAvi N Du
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sign_ComName = new javax.swing.JTextField();
        sign_AdName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sign_Contact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sign_Address = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sign_Province = new javax.swing.JComboBox<>();
        sign_passCon = new javax.swing.JPasswordField();
        sign_pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        sign_cmb_City = new javax.swing.JComboBox<>();

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Company Contact Number");

        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign In");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 500));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Admin Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Confirm Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Name of Company");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        sign_ComName.setBackground(new java.awt.Color(255, 255, 255));
        sign_ComName.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        sign_ComName.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(sign_ComName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 300, 30));

        sign_AdName.setBackground(new java.awt.Color(255, 255, 255));
        sign_AdName.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        sign_AdName.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(sign_AdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 300, 30));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Company Contact Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        sign_Contact.setBackground(new java.awt.Color(255, 255, 255));
        sign_Contact.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        sign_Contact.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(sign_Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 300, 30));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("P.O. box or Street Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        sign_Address.setBackground(new java.awt.Color(255, 255, 255));
        sign_Address.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        sign_Address.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(sign_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 300, 30));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Province");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("City");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        sign_Province.setBackground(new java.awt.Color(255, 255, 255));
        sign_Province.setForeground(new java.awt.Color(0, 0, 0));
        sign_Province.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Province", "Western Province", "Central Province", "Southern Province", "Uva Province", "Sabaragamuwa Province", "North Western Province", "North Central Province", "Nothern Province", "Eastern Province" }));
        jPanel1.add(sign_Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 300, 30));

        sign_passCon.setBackground(new java.awt.Color(255, 255, 255));
        sign_passCon.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        sign_passCon.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(sign_passCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 300, 30));

        sign_pass.setBackground(new java.awt.Color(255, 255, 255));
        sign_pass.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        sign_pass.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(sign_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 300, 30));

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Sign In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 90, -1));

        sign_cmb_City.setBackground(new java.awt.Color(255, 255, 255));
        sign_cmb_City.setForeground(new java.awt.Color(0, 0, 0));
        sign_cmb_City.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select City", "Colombo", "Dehiwala-Mount Lavinia", "Moratuwa", "Jaffna", "Negombo", "Pita Kotte", "Sri Jayewardenepura Kotte", "Kandy", "Trincomalee", "Kalmunai", "Galle", "Point Pedro\t", "Batticaloa", "Katunayaka", "Valvedditturai", "Matara", "Battaramulla South", "Dambulla", "Maharagama", "Kotikawatta", "Anuradhapura", "Vavuniya", "Kolonnawa", "Hendala", "Ratnapura", "Badulla", "Puttalam", "Devinuwara", "Welisara", "Kalutara", "Bentota", "Matale", "Homagama", "Beruwala", "Panadura", "Mulleriyawa", "Kandana", "Ja Ela", "Wattala", "Peliyagoda", "Kelaniya", "Kurunegala", "Nuwara Eliya", "Gampola", "Chilaw", "Eravur Town", "Hanwella Ihala", "Weligama", "Vakarai", "Kataragama", "Ambalangoda", "Ampara", "Kegalle", "Hatton", "Polonnaruwa", "Kilinochchi", "Tangalle", "Monaragala", "Wellawaya", "Gampaha", "Horana South", "Wattegama", "Minuwangoda", "Horawala Junction", "Kuliyapitiya" }));
        jPanel1.add(sign_cmb_City, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Sign in from signin button

        if (sign_ComName.getText().equals("") || sign_AdName.getText().equals("") || sign_pass.getText().equals("") || sign_passCon.getText().equals("")
                || sign_Contact.getText().equals("") || sign_Address.getText().equals("") || sign_Province.getSelectedItem().equals("Select Province")
                || sign_Province.getSelectedItem().equals("Select City")) {

            JOptionPane.showMessageDialog(this, "Please fill all the Fealds to save data...");
            sign_ComName.requestFocus();

        } else {
            if (sign_pass.getText().equals(sign_passCon.getText())) {

                int res = JOptionPane.showConfirmDialog(this, "Are you sure you want to confirm?", "Confrim", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                if (res == JOptionPane.YES_OPTION) {
                    try {
                        DataOb.dbConnects();    //dbConnection

                        int rowId;
                        rowId = DataOb.getLastRowID("company_info", "No");
                        rowId += 1;
                        String id = String.valueOf(rowId);
                        System.out.println(rowId);

                        String arrF[] = {"No", "Campany_Name", "Admin_Name", "Company_Contact", "Address_1", "City", "Province"};
                        String arrV[] = {id, sign_ComName.getText(), sign_AdName.getText(), sign_Contact.getText(), sign_Address.getText(),
                            sign_cmb_City.getSelectedItem().toString(), sign_Province.getSelectedItem().toString()};

                        DataOb.insertData("company_info", arrF, arrV);

                        Date date = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                        String arrF1[] = {"User_ID", "UName", "UPassword", "UNIC", "UAddress", "UPhone", "UEmail", "Salary", "Joined_date", "Post"};
                        String arrV1[] = {id, sign_AdName.getText(), sign_pass.getText(), "", "", sign_Contact.getText(), "", "0", sdf.format(date), "Admin"};

                        DataOb.insertData("users", arrF1, arrV1);
                        JOptionPane.showMessageDialog(this, "Done!");
                        
                        dispose();
                        new Login().setVisible(true);

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e);
                    }

                }

            } else {
                JOptionPane.showMessageDialog(this, "Password didn't match. Please retype correct Password...");
                sign_pass.setText("");
                sign_passCon.setText("");
                sign_pass.requestFocus();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField sign_AdName;
    private javax.swing.JTextField sign_Address;
    private javax.swing.JTextField sign_ComName;
    private javax.swing.JTextField sign_Contact;
    private javax.swing.JComboBox<String> sign_Province;
    private javax.swing.JComboBox<String> sign_cmb_City;
    private javax.swing.JPasswordField sign_pass;
    private javax.swing.JPasswordField sign_passCon;
    // End of variables declaration//GEN-END:variables
}
