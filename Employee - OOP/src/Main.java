public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 10);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
        System.out.println(employee.getBaseSalary());
    }
}