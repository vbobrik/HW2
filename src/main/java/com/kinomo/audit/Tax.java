package main.java.com.kinomo.audit;

public class Tax {
    private double taxPercent = 2.2;
    Tax() {
    }

    public double getTaxPercent() {
        return this.taxPercent;
    }
    public void setTaxPercent(double newTaxPercent) {
        this.taxPercent = newTaxPercent;
    }
}
