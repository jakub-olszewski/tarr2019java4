package pl.sdacademy.tarr2019java4;
//generate test
//alt + enter

/**
 * App
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 23.11.2019 18:00
 **/
public class App {
    //code format
    //ctrl+alt+L

    // alt + insert + enter
    // generate code

    //psvm + tab
    public static void main(String[] args) {
        //sout + tab
        System.out.println("Hello World!");// polecenie wypisuje na konsole


        int number = 5;// deklaracji i inicjalizacji
        System.out.println("To jest liczba "+ number);

        // inny przyklad

        int rok; // deklaracja
        rok = 2019; // inicjalizacja
        //skrót : sout
        System.out.println(rok);
        System.out.println("rok");// to jest napis w cudzysłowiu

        int c; // deklaracja zmiennej c, która zawiera sumę
        c = suma(6,89); // przypisanie wyniku metody do zmiennej c
        System.out.println(c);

        //Example example = new Example();
        Kanapka mojaKanapka = new Kanapka();// utworzenie obiektu kanapka
        mojaKanapka.wyswietlSkladKanapki();// wywolanie metody na obiekcie kanapka
        // wyswietli "nutella" czyli domyslna kanapka

        Kanapka kanapkaZPomidorem = new Kanapka("pomidor");
        kanapkaZPomidorem.wyswietlSkladKanapki();
        // wyswietli "pomidor" czyli konstruktor argumentowy ze skladem

        // TypDanych nazwa = new Obiekt();
        McDonald mcDonaldNaDworcu = new DworzecMcDonaldImpl();// tworzenie obiektu implementacji interfejsu
        mcDonaldNaDworcu.poproszeFrytki(50); // wywolanie metody w mcdonald na dworcu

        User annaNowak21 = new User("Anna","Nowak",21);
        System.out.println(annaNowak21.toString());


        PozycjaZamowienia pozycja1 = new PozycjaZamowienia("Papier A4",11.99f);
        PozycjaZamowienia pozycja2 = new PozycjaZamowienia("Ołówki",2.99f);
        PozycjaZamowienia pozycja3 = new PozycjaZamowienia("Długopisy",7.99f);

        float sumaPozycji = pozycja1.pobierzCena()+pozycja2.pobierzCena()+pozycja3.pobierzCena();

        // brakuje wypisania nazw poszczególnych pozycji
        // toString w klasie PozycjaZamowienia

        System.out.println("Suma pozycji :"+sumaPozycji);





        // dokończyć toString i bez toString
        // konstruktor i przepisywanie wartości - jak to działa ?
        // slajdy skonczylismy na typy danych
        // czym sie roznia prymitywne od obiektowych ?
        // przyklad String oraz double/Double
        //
    }

    /**
     * Metoda sumująca liczby a i b
     * @param a liczba całkowita
     * @param b liczba całkowita
     * @return wynik sumy a+b
     */
    private static int suma(int a, int b) {
        return a+b;
    }


}