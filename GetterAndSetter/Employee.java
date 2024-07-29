package GetterAndSetter;

public class Employee {

    private String name ;
    private int ID;
    private String address;
    private String department;

    public Employee(int ID,String name, String department, String address){

        this.ID = ID;
        this.name = name;
        this.department = department;
        this.address = address;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void show(){
        System.out.println("Name : "+name+"\nID : "+ID
                            +"\nDepartment : "+department+"\nAddress : "+address);
    }
}
