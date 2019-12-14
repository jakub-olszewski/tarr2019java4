package pl.sdacademy.tarr2019java4.javapodstawy.varargs;

public class VarargsMain {

    //Zadanie
    /*
    1. Stwórz pakiet: varargs w javapodstawy
    2. Stwórz klase VarargsMain
    3. W klasie VarargsMain stwórz metodę
    zwracajacą sumę 3 liczb całkowitych
    suma3(int a, int b, int c)
    4. Przetestuj jej działanie w main
     */

    public static void main(String[] args) {
        // testy sumy
        int a = 5;int b =4; int c =2;int d = 7;int e=8;
        {// stała ilość argumentów
            int suma = suma3(a, b, c);
            //int sumaAb = suma3(a,b);// nie mamy takiej metody
            //int sumaAe = suma3(a,b,c,d,e); // nie mamy takiej metody
        }
        // varargs zmienna liczba argumentów
        {
            int suma = sumaN(a);
            suma = sumaN(a,b);
            suma = sumaN(a,b,c);
            suma = sumaN(a,b,c,d,e);
        }
        {
            //Zadanie
            wypiszImiona("Jan","Anna","Andrzej","Janusz");
        }
    }

    /*
    Metoda zawiera dokładnie 3 argumenty
     */
    public static int suma3(int a, int b, int c){
        return a+b+c;
    }
    /*
    3 kropki dają informację o zmiennej ilości argumentów
     */
    public static int sumaN(int... liczby){
        for (int element : liczby){
            // oblicz sume
        }
        return 0;
    }

    /**
     * Stwórz metodę wypisz imiona używając varargs
     */
    public static void wypiszImiona(){

    }

}
