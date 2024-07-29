package overload;

public class User {
    int ID;
    int Salary;
    String name;
    String address;
    public User(int ID , String name ,String address,int Salary ){
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.Salary = Salary;
        show(ID,name);
        show(address,Salary);
    }

    public  void show(int ID ,String name ){
        System.out.println("Your ID : "+ID+"\nYour name : "+name);
    }
    public void  show(String address,int Salary){
        System.out.println("Your address : "+address+"\nYour Salary : "+Salary);
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
