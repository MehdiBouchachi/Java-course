package byValueAndByRefrence;

public class Main {
    public static void main(String[] args) {
       
        byReference byRf = new byReference();

        byReference myName = new byReference();

        String myLName = " Bch";
     
        System.out.println("Original value : "+ myName.name); // we expect Mehdi

        byRf.addName(myName,myLName);

        System.out.println("new Value : "+myName.name); // we expect Mehdi Bch
    }
}
