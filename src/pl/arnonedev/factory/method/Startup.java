package pl.arnonedev.factory.method;

import pl.arnonedev.factory.method.factory.AudiFactory;
import pl.arnonedev.factory.method.factory.HondaFactory;
import pl.arnonedev.factory.method.factory.OurCompany;
import pl.arnonedev.factory.method.model.Car;

/**
 * Created by Arek on 2017-05-07.
 */
public class Startup {
    public static void main(String[] args) {
        OurCompany company = new AudiFactory("Poland", "Audi factory");
        System.out.println(company);
        Car car = company.orderCar("A8");
        System.out.println(car);
        car = company.orderCar("A4");
        System.out.println(car);

        company = new HondaFactory("Japan", "Honda factory");
        System.out.println(company);
        car = company.orderCar("ACCORD");
        System.out.println(car);
    }
}
