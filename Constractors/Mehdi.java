
public class Mehdi {

    int Id, age;
    String name;
    public Mehdi(String n ,int i ){
        name = n;
        Id = i;
    }
    public Mehdi(String Name , int Age , int ID){
        name = Name;
        age = Age;
        Id = ID;
    }
    public void  show(){
        System.out.println("\nID : "+Id+"\nName : "+name);
    }
    public void show1(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nID : "+Id);
    }

}