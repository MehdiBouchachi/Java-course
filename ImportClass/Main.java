package ImportClass;

public class Main {
    public static void main(String[] args) {

        FirstClass [] name = {new FirstClass(), new FirstClass()};

        SecondClass secondClass = new SecondClass();
        
        secondClass.print(name);

    }
}
