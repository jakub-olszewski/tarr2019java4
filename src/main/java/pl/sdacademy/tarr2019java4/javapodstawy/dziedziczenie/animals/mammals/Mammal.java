package pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.mammals;

import pl.sdacademy.tarr2019java4.javapodstawy.dziedziczenie.animals.Animal;

/**
 * Mammal - klasa opisująca ssaki posiada
 * konstruktor super z Animal
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 **/
public class Mammal extends Animal {

    /**
     * Konstruktor tworzenia ssaka
     * @param name
     */
    public Mammal(String name) {
        super(name); //super oznacza kontruktor klasy ktora rozszezamy czyli animal

    }
}
