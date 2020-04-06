package eli.practice.oop;

public abstract class Employee {

    private String firstName;
    private String lastName;

    //needs constructor, getters, and setters
    public Employee(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract double getWeeklyCost();


    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

}
