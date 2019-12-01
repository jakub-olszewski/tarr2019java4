package pl.sdacademy.tarr2019java4.javapodstawy.kolekcje;

import pl.sdacademy.tarr2019java4.javapodstawy.interfejsy.DworzecMcDonaldImpl;
import pl.sdacademy.tarr2019java4.javapodstawy.interfejsy.McDonald;
import pl.sdacademy.tarr2019java4.javapodstawy.interfejsy.User;
import pl.sdacademy.tarr2019java4.javapodstawy.operatory.PozycjaZamowienia;

import java.util.ArrayList;
import java.util.List;

public class KolekcjeMain {

    public static void main(String[] args) {


        // McDonald -> interfejs
        // DworzecMcDonaldImpl -> implementacja McDonald
        McDonald sklep = new DworzecMcDonaldImpl();
        sklep.poproszeFrytki(10f);

        // lista liczb
        // ArrayList -> implementacja List
        List<Integer> listaLiczb = new ArrayList<>();
        listaLiczb.add(5);

        List<User> listaUzytkownikow = new ArrayList<>();


        // Utworz liste pozycji w zamówieniu
        // Lista PozycjaZamowienia 3 pozycje
        PozycjaZamowienia pozycja1 = new PozycjaZamowienia("Pizza Vege",29.99f);
        PozycjaZamowienia pozycja2 = new PozycjaZamowienia("Pizza Margarita",9.99f);
        PozycjaZamowienia pozycja3 = new PozycjaZamowienia("Pizza Mefisto",19.99f);

        List<PozycjaZamowienia> listaPozycji = new ArrayList<>();
        listaPozycji.add(pozycja1);
        listaPozycji.add(pozycja2);
        listaPozycji.add(pozycja3);

    }
}
