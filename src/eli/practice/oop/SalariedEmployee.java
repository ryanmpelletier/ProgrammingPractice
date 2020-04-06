package eli.practice.oop;

public class SalariedEmployee extends Employee implements JobDoer {

    private int salary;

    public SalariedEmployee(int salary, String firstName, String lastName){
        super(firstName, lastName);
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }

    public double getWeeklyCost(){
        return this.salary / 52;
    }
    public void doJob(){
        System.out.println("Im an salaried employee doing my job");
    }
}
