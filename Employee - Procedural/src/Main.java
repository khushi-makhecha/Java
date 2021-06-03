public class Main {
    public static void main(String[] args) {
        int baseSalary = 30_000;
        int hourlyRate = 2_000;
        int extraHours = 3;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ){
        return baseSalary + (extraHours * hourlyRate);
    }
}