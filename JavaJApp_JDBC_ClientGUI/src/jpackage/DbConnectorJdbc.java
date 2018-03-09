package jpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DbConnectorJdbc {

    private static final String URLSTRING = "jdbc:neo4j:bolt://localhost"; 
    private static final String USERNAME= "neo4j";   
    private static final String PASSWORD= "password";

    public static Connection getConnection() throws Exception {
        try {
            Connection con = DriverManager.getConnection(URLSTRING, USERNAME, PASSWORD);
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
