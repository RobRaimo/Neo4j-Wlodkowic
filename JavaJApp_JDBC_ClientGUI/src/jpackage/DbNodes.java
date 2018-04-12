package jpackage;

import java.util.List;

public class DbNodes {
    
    // property
    private int id;
    private List<String> labels;
    private String name;
    private String surname;
       
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
    
    @Override
    public String toString(){
            return getId() + " " + getLabels() + " " + getName() + ", " + getSurname();
    }
    
}
