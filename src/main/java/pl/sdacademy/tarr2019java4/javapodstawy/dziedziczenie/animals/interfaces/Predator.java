package pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.interfaces;

import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.Animal;

/**
 * Predator - interfejst umożliwiający jedzenie zwierząt
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 *
 **/
public interface Predator {

    /**
     * Metoda z interfejsu Predator
     * umożliwia jedzenie zwierząt
     * @param animal zwierze które zostaje zjedzone
     */
    public void eat(Animal animal);
}
