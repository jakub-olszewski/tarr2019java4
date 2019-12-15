package pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.mammals;

import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.Animal;
import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.interfaces.Predator;

/**
 * Fox
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 **/
public class Fox extends Mammal implements Predator {

    public Fox(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Fox
    }
}
