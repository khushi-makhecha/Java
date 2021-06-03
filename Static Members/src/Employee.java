public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public static int numberOfEmployees;

    public Employee(int baseSalary) {
        setBaseSalary(baseSalary);
    }

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * getHourlyRate());
    }

    public int calculateWage(){
        return calculateWage(0);
    }

    public void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Base salary cannot be zero or less!");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be zero or less!");
        this.hourlyRate = hourlyRate;
    }
}