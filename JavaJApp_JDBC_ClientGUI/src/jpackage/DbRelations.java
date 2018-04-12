package jpackage;

import java.util.List;

public class DbRelations {
    
    // property
    private int id;
    private List<String> labels;
    private String name;
    private String surname;
    private String type;
    private int startId;
    private int endId;
    
    //getter setter methods
    public int getId() {
        return id;
    }
    
    public void setId(int newId) {
        this.id = newId;
    }
    
    public List<String> getLabels() {
        return labels;
    }
    
    public void setLabels(List<String> newLabel) {
        this.labels = newLabel;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }
     
    public String getType() {
        return type;
    }
    
    public void setType(String newType) {
        this.type = newType;
    }
    
    public int getStartId() {
        return startId;
    }
    
    public void setStartId(int newStartId) {
        this.startId = newStartId;
    }
    
    public int getEndId() {
        return endId;
    }
    
    public void setEndId(int newEndId) {
        this.endId = newEndId;
    }  
    
    @Override
    public String toString(){
            return getId() + " " + getLabels() + " " + getName() + ", " + getSurname();
    }
    
}
