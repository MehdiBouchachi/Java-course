package byValueAndByRefrence;

public class byReference {

    String name = "Mehdi";

    public void addName(byReference myName , String lastName){

        myName.name = myName.name  + lastName;
        
    }
}
