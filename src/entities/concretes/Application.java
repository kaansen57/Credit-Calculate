package entities.concretes;

import java.util.List;

public class Application {
    private int id;
    private double creditPrice;
    private int creditPaymentTerm;

    public Application() {
    }

    public Application(int id, double creditPrice, int creditPaymentTerm) {
        this.id = id;
        this.creditPrice = creditPrice;
        this.creditPaymentTerm = creditPaymentTerm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCreditPrice() {
        return creditPrice;
    }

    public void setCreditPrice(double creditPrice) {
        this.creditPrice = creditPrice;
    }

    public int getCreditPaymentTerm() {
        return creditPaymentTerm;
    }

    public void setCreditPaymentTerm(int creditPaymentTerm) {
        this.creditPaymentTerm = creditPaymentTerm;
    }
}
