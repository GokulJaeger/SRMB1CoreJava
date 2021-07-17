package day23;

public class Car {
    private int id;
    private String cname;
    private String cmodel;
    Car(){
        
    }
    public Car(int id, String cname, String cmodel) {
        this.id = id;
        this.cname = cname;
        this.cmodel = cmodel;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getCmodel() {
        return cmodel;
    }
    public void setCmodel(String cmodel) {
        this.cmodel = cmodel;
    }
    @Override
    public String toString() {
        return "Car [cmodel=" + cmodel + ", cname=" + cname + ", id=" + id + "]";
    }

    
}
