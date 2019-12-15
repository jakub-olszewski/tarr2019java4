package pl.sdacademy.tarr2019java4.javapodstawy.abstrakcja.figury;

import pl.sdacademy.tarr2019java4.javapodstawy.abstrakcja.Figura;

public class Prostokat extends Figura {

    int a,b;

    public Prostokat(String nazwa) {
        super(nazwa);// wywołanie konstruktora rodzica/dziadka
    }

    public Prostokat(int a,int b){
        this("Prostokat");
        this.a = a;
        this.b = b;
    }

    @Override
    public int obliczPole() {
        return a*b;
    }

    @Override
    public int obliczObwod() {
        return 2*a+2*b;
    }

}
