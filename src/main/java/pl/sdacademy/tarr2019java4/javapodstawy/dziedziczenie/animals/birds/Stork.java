package pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.birds;

import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.Animal;
import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.interfaces.Predator;

/**
 * Stork
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 **/
public class Stork extends Bird implements Predator {

    public Stork(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Stork
    }
}
