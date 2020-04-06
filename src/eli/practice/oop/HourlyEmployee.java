package eli.practice.oop;

public class HourlyEmployee extends Employee implements JobDoer {

    int hoursPerWeek;
    double hourlyRate;

    public HourlyEmployee(String firstName, String lastName, int hoursPerWeek, double hourlyRate){
        super(firstName, lastName);
        this.hoursPerWeek = hoursPerWeek;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursPerWeek(){
        return this.hoursPerWeek;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getWeeklyCost(){
        return hoursPerWeek * hourlyRate;
    }

    public void doJob(){
        System.out.println("Im an hourly employee doing my job");
    }

}
