public class ProjectCreate{
    private String name;
    private String description;
    private Double cost;
    
    public String elevatorPitch(){
        return(this.getName() + " ($" +Double.toString(getCost()) + ")" + " : " + this.getDescription());
    }

    //Constructors
    public ProjectCreate(){
        this.name = "";
        this.description = "";
        this.cost = 0.00;
    }
    public ProjectCreate(String projectName){
        this.name = projectName;
        this.description = "";
        this.cost = 0.00;  
    }
    public ProjectCreate(String projectName, String projectDescription){
        this.name = projectName;
        this.description = projectDescription;
        this.cost = 0.00;
    }
    public ProjectCreate(String projectName, String projectDescription, Double projectCost){
        this.name = projectName;
        this.description = projectDescription;
        this.cost = projectCost;        
    }

    //Setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    public void setCost(Double projectCost){
        this.cost = projectCost;
    }

    //Getters
    public String getName() {
        return (name);
    }
    public String getDescription(){
        return (description);
    }
    public Double getCost(){
        return (cost);
    }
}