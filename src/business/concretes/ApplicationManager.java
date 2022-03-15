package business.concretes;

import business.abstracts.Credit;
import entities.concretes.Application;
import entities.concretes.Customer;

import java.util.List;

public class ApplicationManager {

    private List<Credit> credits;
    private Customer customer;

    public ApplicationManager(Customer customer, List<Credit> credits) {
        this.credits = credits;
        this.customer = customer;
    }

    public void customerApplication(Application application) {
        if (credits.size() > 0) {
            System.out.println(customer.getName() + " " +
                    application.getCreditPrice() + " TL'lik  kredi isteği tutarlarınız ↓");
            for (Credit credit : credits) {
                credit.calculate(application.getCreditPaymentTerm(), application.getCreditPrice());
            }
        } else {
            System.out.println("lütfen kredi türü giriniz!");
        }
    }
}
