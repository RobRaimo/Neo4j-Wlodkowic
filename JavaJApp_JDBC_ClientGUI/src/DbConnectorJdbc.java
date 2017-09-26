
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class DbConnectorJdbc {

    //private static String driverName = "com.mysql.jdbc.Driver"; 
    //private static String driverName = "org.neo4j.jdbc.Driver"; 
    private static String urlString = "jdbc:neo4j:bolt://localhost"; 
    private static String userName = "neo4j";   
    private static String passWord = "password";
    //private static Connection con;

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(urlString, userName, passWord);
    }
    
    /*
    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(urlString, userName, passWord);
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Failed to create the database connection.\n\n"+ex, "error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver not found.\n\n"+ex, "error", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    */
}
