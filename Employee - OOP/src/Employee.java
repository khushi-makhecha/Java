public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary) {
        setBaseSalary(baseSalary);
    }

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * getHourlyRate());
    }

    public int calculateWage(){
        return baseSalary;
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