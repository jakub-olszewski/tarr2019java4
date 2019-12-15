package pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.interfaces;

import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.plants.Plant;

/**
 * Vegenarian - interfejst umożliwiający jedzenie roślin
 * posiada metode eat(Plant plant)
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 **/
public interface Vegenarian {

    /**
     * Metoda odpowiedzialna za jedzenie roślinek
     * @param plant
     */
    public void eat(Plant plant);
}
