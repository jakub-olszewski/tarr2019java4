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