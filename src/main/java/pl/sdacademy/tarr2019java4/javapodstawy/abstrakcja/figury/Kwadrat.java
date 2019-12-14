package pl.sdacademy.tarr2019java4.javapodstawy.abstrakcja.figury;

import pl.sdacademy.tarr2019java4.javapodstawy.abstrakcja.Figura;

public class Kwadrat extends Figura {

    int a;

    public Kwadrat(String nazwa) {
        super(nazwa);// wywołanie konstruktora rodzica/dziadka
    }

    public Kwadrat(int a){
        this("Kwadrat");
        this.a = a;
    }

    @Override
    public int obliczPole() {
        return a*a;
    }

    @Override
    public int obliczObwod() {
        return 4*a;
    }

    @Override
    public String toString() {
        return nazwa+" pole:"+obliczPole();
    }
}
