/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajapp_bolt_client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.neo4j.driver.v1.*;

/**
 *
 * @author UserW7
 */
public class JavaJApp_BOLT_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String vrSelect = "";
        try {
            System.out.println(
                "--- Java BOLD Client Connection Test ---\n" +
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
                //Connection("MATCH (n:Person) RETURN n.name, n.surname");
                break;
            case "3":
                Connection("MATCH (n:Person) WHERE n.name = 'Bob' DETACH DELETE n");
                break;
            default:
                System.out.println("Selection not valid, try again");
        }
    }
    
    // Java BOLD caller
    private static void Connection(String vrCQL){
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j","password"));
        Session session = driver.session();
        StatementResult result = session.run(vrCQL);
        while (result.hasNext()) {
            Record record = result.next();
            
            //System.out.println( record.get("name").asString() + " " + record.get("surname").asString() );
            //System.out.println(record);
            
            
            List<String> sword = new ArrayList<>();
            for (String key: record.keys()) {
                sword.add(key + ": " + record.get(key) );
            }
            System.out.println(sword);
            
            
            /*
            List<Object> lsProperties = record.get("Person").asList();
            for (Object obProperty: lsProperties) {
                System.out.println(obProperty);
            }
            */
        }
        session.close();
        driver.close();
    }
}
