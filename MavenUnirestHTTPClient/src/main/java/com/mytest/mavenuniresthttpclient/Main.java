/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mytest.mavenuniresthttpclient;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 *
 * @author UserW7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnirestException {
        // TODO code application logic here
        String vrURL = "http://localhost:7474/db/data";
        /*
        HttpResponse<JsonNode> response = Unirest.get(vrURL)
            .basicAuth("neo4j", "password")
            .asJson();
        */
        HttpResponse<JsonNode> jsonResponse = Unirest.get("http://localhost:7474/db/data/")
            //.header("Content-Type", "application/json")
            //.queryString("MATCH (n) RETURN n LIMIT 25","")
            .asJson();
        
        //System.out.println("Printout " + response);
        System.out.println("Printout " + jsonResponse.toString());
        
        
    }
    
}
