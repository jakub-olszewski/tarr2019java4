package pl.sdacademy.tarr2019java4.javapodstawy.instrukcje.warunkowe;

public class InstrukcjeMain {

    public static void main(String[] args) {

        // uzycie metody na pelnoletnosc

        // wiek 15

        // wiek 21

        // wypisanie na ekran

        boolean odpowiedz =  Sprawdz.czyJestPelnoletni(32);
        //if(odpowiedz==true){// odpowiedzi jest true albo false / wiec nie trzeba
            //pisać == true
        if(odpowiedz)
            System.out.println("Jest pelnoletni");
        }else{
            System.out.println("Nie jest pelnoletni");
        }

        //enum Status i Plec
    }
}
