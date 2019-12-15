package pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.mammals;

import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.interfaces.Prey;
import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.interfaces.Vegenarian;
import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.plants.Plant;

/**
 * Elephant
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 **/
public class Elephant extends Mammal implements Vegenarian, Prey {

    /**
     * Konstruktor tworzenia słonia
     * @param name imie słonia
     */
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void eat(Plant plant) {
        // kod opisujacy wykonanie metody przez Deer
    }




}
