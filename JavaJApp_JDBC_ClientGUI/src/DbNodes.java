/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UserW7
 */
public class DbNodes {
    
    // fields
    private int id;
    private String label;
    private String name;
    private String surname;
    
    // constructor
    public DbNodes(int nodeId, String nodeLabel, String nodeName, String nodeSurname) {
        id = nodeId;
        label = nodeLabel;
        name = nodeName;
        surname = nodeSurname;
    }
    
    // methods
    
    public void setId(int newValue) {
        id = newValue;
    }
    
    public void setLabel(String newString) {
        label = newString;
    }
    
    public void setName(String newString) {
        name = newString;
    }
        
    public void setSurname(String newString) {
        surname = newString;
    }
    
}
