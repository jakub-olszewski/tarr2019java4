package pl.sdacademy.tarr2019java4.javapodstawy.abstrakcja.figury;

import pl.sdacademy.tarr2019java4.javapodstawy.abstrakcja.Figura;

public class Kwadrat extends Prostokat {

    public Kwadrat(String nazwa) {
        super(nazwa);// wywołanie konstruktora rodzica/dziadka
    }

    public Kwadrat(int a){
        this("Kwadrat");
        this.a = a;
        this.b = a;
    }

}
