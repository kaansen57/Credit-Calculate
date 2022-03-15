package business.concretes;

import business.abstracts.Credit;

public class OfficerCredit implements Credit {

    private int tax = 20;

    @Override
    public void calculate(int year, double price) {
        double yearlyInterest = (price * tax / 100);
        double totalPrice = price;

        for (int i = 0; i < year; i++) {
            totalPrice += yearlyInterest;
        }

        System.out.println("memur kredisi tutarı : " + totalPrice);
    }
}
