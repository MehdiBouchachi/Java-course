package methodOverride;

public class Manager {
    double prime;
    double Salary;
    double fullSalary;
    public void Salary(int exp){

        if (exp <= 2){
            Salary = 35000;
            prime = 3000;
        }else if( exp <5){
            Salary = 40000;
            prime = 5000;
        }else {
            Salary = 45000;
            prime = 10000;
        }
        fullSalary = Salary + prime;
        System.out.println("Manager salary : "+fullSalary);

    }
}
