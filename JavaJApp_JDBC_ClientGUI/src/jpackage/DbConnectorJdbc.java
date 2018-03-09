package jpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DbConnectorJdbc {

    private static String urlString = "jdbc:neo4j:bolt://localhost"; 
    private static String userName = "neo4j";   
    private static String passWord = "password";

    public static Connection getConnection() throws Exception {
        try {
            Connection con = DriverManager.getConnection(urlString, userName, passWord);
            return con; 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null, 
                    "Failed to create the database connection.\n\n"+ex, 
                    "error", 
                    JOptionPane.ERROR_MESSAGE
            );
        }
        return null;
    }
    
}
