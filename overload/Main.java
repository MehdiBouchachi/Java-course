package overload;

public class Main {
    public static void main(String[] args) {

      User user = new User(32018664,"Mehdi","Some Where",250000);

        System.out.println("-------------------------------------------------------");
        user.show(user.getID(), user.getName());
        user.show(user.getAddress(), user.getSalary());
        System.out.println("-------------------------------------------------------");

        user.show(15054661,"Mohamed");
        user.show("some where",35000);
    }
}
