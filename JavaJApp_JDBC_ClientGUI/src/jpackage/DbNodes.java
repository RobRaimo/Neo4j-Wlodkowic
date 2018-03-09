package jpackage;

public class DbNodes {
    
    // fields
    private int id;
    private String labels;
    private String name;
    private String surname;
    
    // constructor
    public DbNodes(int nodeId, String nodeLabels, String nodeName, String nodeSurname) {
        super();
        id = nodeId;
        labels = nodeLabels;
        name = nodeName;
        surname = nodeSurname;
    }
    
    //getter setter methods
    public int getId() {
        return id;
    }
    
    public void setId(int newId) {
        this.id = newId;
    }
    
    public String getLabel() {
        return labels;
    }
    
    public void setLabel(String newLabel) {
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
    
}
