package ThisKeyword;

public class User {
    int ID ;
    String username;
    String password;
    public User(int ID, String username, String password){

        this.ID = ID;
        this.username = username;
        this.password = password;

    }

    public void show(){
        System.out.println("User ID : "+ID+
                "\nUser username : "+username+
                "\nUser password : "+password);
    }
}
