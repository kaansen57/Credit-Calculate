package business.concretes;

import business.abstracts.Credit;

public class NeedCredit implements Credit {
    private int tax = 21;

    @Override
    public void calculate(int year, double price) {
        double yearlyInterest = (price * tax / 100);
        double totalPrice = price;

        for (int i = 0; i < year; i++) {
            totalPrice += yearlyInterest;
        }

        System.out.println("ihtiyaç kredisi tutarı :" + totalPrice);
    }
}
