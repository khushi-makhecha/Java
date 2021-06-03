package com.khushi;

public class Calculations {
    private final byte MONTHS_IN_YEAR = 12;
    private final int principal;
    private final float annualInterest;
    private final byte years;

    public Calculations(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateMortgage (){
        return getCalculated(getIntermediate(getNoOfPayments()));
    }

    public double calculateBalance (short numberOfPaymentsMade){
        return getCalculated((getIntermediate(getNoOfPayments()) - getIntermediate(numberOfPaymentsMade)));
    }

    public byte getMONTHS_IN_YEAR() {
        return MONTHS_IN_YEAR;
    }

    private float getMonthlyInterest(){
        byte PERCENT = 100;
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    private float getNoOfPayments(){
        return years * MONTHS_IN_YEAR;
    }

    private float getIntermediate(float method){
        return (float) Math.pow(1 + getMonthlyInterest(), method);
    }

    private float getCalculated(float numerator){
        return principal * numerator / (getIntermediate(getNoOfPayments())-1);
    }
}