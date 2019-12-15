package pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.birds;

import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.Animal;
import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.interfaces.Predator;

/**
 * Eagle
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 *
 * Orzeł który dziedziczy po ptaku (Bird)
 * posiada możliwość (implements) jedzenia zwierząt (Predator)
 **/
public class Eagle extends Bird implements Predator{

    /**
     * Konstruktor tworzenia/rodzenia orła
     * @param name argument, czyli imie orła
     */
    public Eagle(String name) {
        // super - konstruktor który pochodzi z extends Bird
        super(name);
    }


    @Override
    public void eat(Animal animal) {
        System.out.printf("\n'%s' została zjedzona przez '%s'",animal.getName(),this.getName());
        // kod opisujacy wykonanie metody przez Eagle
    }
}
