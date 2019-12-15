package pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.interfaces;

import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.Animal;

/**
 * Prey- interfejst umożliwiający uciekanie od zwięrząt
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 **/
public interface Prey {

    /**
     * Metoda ucieczki od danego zwięrzęcia
     * @param animal zwierze od którego uciekamy
     */
    void runAwayFrom(Animal animal);
}
