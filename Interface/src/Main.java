public class Main {

    public static void main(String[] args) {
        var report = new TaxReport();
        report.show(new TaxCalculator2020(1_00_000));
        report.show(new TaxCalculator2021(1_00_000));
    }
}