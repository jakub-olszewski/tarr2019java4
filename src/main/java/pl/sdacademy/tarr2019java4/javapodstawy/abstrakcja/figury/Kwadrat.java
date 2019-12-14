package pl.sdacademy.tarr2019java4.javapodstawy.abstrakcja.figury;

import pl.sdacademy.tarr2019java4.javapodstawy.abstrakcja.Figura;

public class Kwadrat extends Figura {

    public Kwadrat(String nazwa) {
        super(nazwa);// wywołanie konstruktora rodzica/dziadka
    }

    @Override
    public int obliczPole() {
        return 0;
    }

    @Override
    public int obliczObwod() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
