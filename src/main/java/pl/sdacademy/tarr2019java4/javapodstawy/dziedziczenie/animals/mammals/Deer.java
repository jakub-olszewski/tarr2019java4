package pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.mammals;

import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.interfaces.Prey;
import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.interfaces.Vegenarian;
import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.plants.Plant;

/**
 * Deer - jelonek
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 **/
public class Deer extends Mammal implements Vegenarian, Prey {

    /**
     * Konstuktor tworzy/rodzi jelonka
     * @param name imię jelonka
     */
    public Deer(String name) {
        super(name);
    }

    @Override
    public void eat(Plant plant) {
        System.out.printf("\n%s je %s",this.getName(),plant.getName().toLowerCase());
        // kod opisujacy wykonanie metody przez Deer
    }

}
