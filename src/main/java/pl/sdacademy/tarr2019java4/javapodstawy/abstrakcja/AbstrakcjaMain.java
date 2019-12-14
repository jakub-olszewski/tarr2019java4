package pl.sdacademy.tarr2019java4.javapodstawy.abstrakcja;

import pl.sdacademy.tarr2019java4.javapodstawy.abstrakcja.figury.Kwadrat;
import pl.sdacademy.tarr2019java4.javapodstawy.interfejsy.McDonald;

import java.util.ArrayList;
import java.util.List;

public class AbstrakcjaMain {

    public static void main(String[] args) {

        Figura kwadrat = new Kwadrat("Kwadrat");
        kwadrat = new Kwadrat(4);
        System.out.println(kwadrat.obliczPole());
        // Trojkat
        // Trojkat równoboczny
        // prostokąt
        // koło
        // wszystkie figury tworzymy w pakiecie figury

        /*
        Zadanie: Stwórz listę figur ,wypisz informacje
        zsumuj pola;
         */
        List<Figura> listaFigur = new ArrayList<>();
        int suma = 0;
        for(Figura figura : listaFigur){
            System.out.println(figura);
            suma += figura.obliczPole();
        }
        System.out.println("Suma pól figur: "+suma);


        /*Poniżej żarcik*/
        int a= 5;
        String kotki= null;
        spij(a,a,a,kotki,2);
    }

    public static void spij(int g,int b,int c, String t,int a){
        System.out.println("i dobranoc... zZzzz");
    }
}
