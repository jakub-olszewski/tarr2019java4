package pl.sdacademy.tarr2019java4.javapodstawy.abstrakcja.figury;

import pl.sdacademy.tarr2019java4.javapodstawy.abstrakcja.Figura;

public class Kolo extends Figura {

    int r;

    public Kolo(int r){
        super("Kolo");
        this.r = r;
    }

    @Override
    public int obliczPole() {
        // round zaokrągla
        // pow - power potęga
        return (int)Math.round((float)Math.PI*Math.pow(r,2));
    }

    @Override
    public int obliczObwod() {
        return (int)Math.round((float)2*Math.PI*r);
    }

}
