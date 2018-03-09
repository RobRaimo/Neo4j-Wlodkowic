package jpackage;

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
    
    //getter setter methods
    public int getId() {
        return id;
    }
    
    public void setId(int newId) {
        this.id = newId;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String newType) {
        this.type= newType;
    }
    
    public int getStartId() {
        return startId;
    }
        
    public void setStartId (int newValue) {
        this.startId = newValue;
    }
    
    public int getEndId() {
        return endId;
    }
    
    public void setEndId(int newValue) {
        this.endId = newValue;
    }
    
}
