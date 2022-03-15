package api;

import business.concretes.ApplicationManager;
import business.concretes.CarCredit;
import business.concretes.NeedCredit;
import business.concretes.OfficerCredit;
import business.abstracts.Credit;
import entities.concretes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Credit> credits = new ArrayList<Credit>();
        credits.add(new NeedCredit());
        credits.add(new CarCredit());
        credits.add(new OfficerCredit());

        //boş kredi
        List<Credit> credits2 = new ArrayList<Credit>();


        Customer customer1 = new Customer(1, "Kaan");
        Application application = new Application(1, 50000, 2);
        Application application2 = new Application(2, 100000, 5);

        ApplicationManager applicationManager = new ApplicationManager(customer1,credits);
        applicationManager.customerApplication(application);
        System.out.println("********************");
        applicationManager.customerApplication(application2);
    }
}
