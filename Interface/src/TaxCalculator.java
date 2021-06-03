public interface TaxCalculator {
    double calculateTax();
    double print();
    float minimumTax = 5_000;
    static double getTax(double income, double expense){
        return income - expense;
    }
}
