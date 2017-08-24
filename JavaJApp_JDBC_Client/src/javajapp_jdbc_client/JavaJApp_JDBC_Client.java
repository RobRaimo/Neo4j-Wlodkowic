/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajapp_jdbc_client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author UserW7
 */
public class JavaJApp_JDBC_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String vrSelect = "";
        try {
            System.out.println(
                "--- Java JDBC Client Connection Test ---\n" +
                "Select operation:\n" +
                "1- Create Node n:Person {name:'Bob', surname:'Dylan'}\n" +
                "2- Query Node (n)\n" +
                "3- Delete Node n:Person {name:'Bob'}\n"
            );
            vrSelect = input.readLine().toLowerCase();
        } catch (Exception e) {
                    
        }
        switch(vrSelect){    
            case "1":
                Connection("CREATE (n:Person {name:'Bob', surname:'Dylan'})");
                break; 
            case "2":
                Connection("MATCH (n) RETURN n");
                //Connection("MATCH (n:Person) RETURN n");
                break;
            case "3":
                Connection("MATCH (n:Person) WHERE n.name = 'Bob' DETACH DELETE n");
                break;
            default:
                System.out.println("Selection not valid, try again");
        }
    }
    
    // Java JDBC caller
    private static void Connection(String vrCQL) throws SQLException{

        // Connect
        Connection con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost", "neo4j", "password");

        // Querying
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(vrCQL);
            while (rs.next()) {
		System.out.println(rs.getString("n"));
            }
        }
        con.close();
        
    }

}
