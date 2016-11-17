
public class Job {

    private String category;
    private String location;
    private String employType;

    //Full Argument
    public Job(String category, String location, String employType){
        this.category = category;
        this.location = location;
        this.employType = employType;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public String getEmployType() {

        return employType;
    }

    public void setEmployType(String employType) {

        this.employType = employType;
    }
}
