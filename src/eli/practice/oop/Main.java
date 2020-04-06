package eli.practice.oop;

public class Main {

    public static void main(String[] args){

        //create an array of Employee objects, some of them will be SalariedEmployee objects, some of them will be HourlyEmployee objects
        //count the total cost of the employee array for a week
        Employee cassie = new HourlyEmployee("Cassie", "Pelletier", 36, 15.00 );
        Employee eli = new SalariedEmployee(50000, "Eli", "Pelletier" );
        System.out.println(eli.getFirstName());
        System.out.println(eli.getLastName());
        System.out.println(eli.getWeeklyCost());
        Employee[] employeeList = {cassie,eli};
        System.out.println(totalWeeklyCost(employeeList));
    }

    //this method will be implemented to tell you the total cost of all the employees for a week
    public static double totalWeeklyCost(Employee[] employees){
        double sum = 0;
        for(int i = 0; i < employees.length; i++){
            sum = sum + employees[i].getWeeklyCost();
        }
        return sum;
    }
}