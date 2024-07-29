package methodOverride;

public class Employee extends Manager{
    public void Salary(int exp){

        if (exp <= 2){
            Salary = 25000;
            prime = 1500;
        }else if( exp <5){
            Salary = 35000;
            prime = 3000;
        }else {
            Salary = 40000;
            prime = 5000;
        }
        fullSalary = Salary + prime;
        System.out.println("Employee salary : "+fullSalary);

    }
}