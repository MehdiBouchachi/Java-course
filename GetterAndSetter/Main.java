package GetterAndSetter;

public class Main {
    public static void main(String[] args) {

       Employee employee = new Employee(321086643,"Mehdi","MI","Cite N05");
       employee.show();

       String nameBefore = employee.getName();//getting the name from constructor and adding it to the var
       employee.setName("Mohamed");//changing thr name value in constructor from mehdi to mohamed
       String nameAfter = employee.getName();//getting the name from constructor after setName

       System.out.println("\n--------------------------\n");
       System.out.println("Name before : "+nameBefore);
       System.out.println("Name after : "+nameAfter);
       System.out.println("\n--------------------------");

       employee.show();

    }
}
