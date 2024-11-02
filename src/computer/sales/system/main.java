/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer.sales.system;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author NAvi N Du
 */
public class main {
    
    public static void main(String[] args) {
        //with out insert mySQL password
        main main = new main();
        main.testConnection();
        
        //with insert mySQL password
//        new Database_Information().setVisible(true);
        
    }
    
    public void testConnection(){
        
        try{
            DataOb.dbConnects();
            System.out.println("Database connection success");
            
            int no = DataOb.getLastRowID("company_info", "NO");
            
            if (no == 1){
                new Login().setVisible(true);
            } else {
                new SignIn().setVisible(true);
            }
            
        }catch(Exception e){
            System.out.println(e);
            Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent, "You entered MySQL User and Password is Invalid! \nPlease enter correct Usar and Password. ");
            //new Database_Information().setVisible(true);
        }
    }
}

    

