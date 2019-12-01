package pl.sdacademy.tarr2019java4.javapodstawy.kolekcje;

import pl.sdacademy.tarr2019java4.javapodstawy.interfejsy.DworzecMcDonaldImpl;
import pl.sdacademy.tarr2019java4.javapodstawy.interfejsy.McDonald;
import pl.sdacademy.tarr2019java4.javapodstawy.interfejsy.User;

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

    }
}
