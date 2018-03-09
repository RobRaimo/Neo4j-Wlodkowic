/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UserW7
 */
public class DbRelations {
    
        // fields
    private int id;
    private String type;
    private int startId;
    private int endId;
    
    // constructor
    public DbRelations(int relId, String relType, int relStartId, int relEndId ) {
        id = relId;
        type = relType;
        startId = relStartId;
        endId = relEndId;
    }
    
    //getter methods
    
    public void setId(int newValue) {
        id = newValue;
    }
    
    public void setType(String newString) {
        type= newString;
    }
    
    public void setStartId (int newValue) {
        startId = newValue;
    }
        
    public void setEndId(int newValue) {
        endId = newValue;
    }
    
    //setter methods
    
}
