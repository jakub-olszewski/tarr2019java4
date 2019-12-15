package pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.mammals;

import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.Animal;
import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.interfaces.Predator;

/**
 * Whale
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 **/
public class Whale extends Mammal implements Predator {
    public Whale(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Whale
    }
}
