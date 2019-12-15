package pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.snakes;

import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.Animal;
import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.interfaces.Predator;

/**
 * Snake
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 **/
public abstract class Snake extends Animal implements Predator {
    public Snake(String name) {
        super(name);
    }

    // metoda poruszania się zygzakiem goZigzag()

}
