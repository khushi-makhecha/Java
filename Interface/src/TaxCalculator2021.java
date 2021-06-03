public class TaxCalculator2021 implements TaxCalculator{
    private double taxableIncome;

    public TaxCalculator2021(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax(){
        var tax = TaxCalculator.getTax(1000, 200);
        System.out.println(tax);
        return taxableIncome * 0.4;
    }

    @Override
    public double print(){
        return 0;
    }

}
