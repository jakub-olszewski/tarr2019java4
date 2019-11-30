package pl.sdacademy.tarr2019java4.operatory;

public class OperatoryMain {

    public static void main(String[] args) {
        PozycjaZamowienia pozycja1 = new PozycjaZamowienia("Papier A4",11.99f);
        PozycjaZamowienia pozycja2 = new PozycjaZamowienia("Ołówki",2.99f);
        PozycjaZamowienia pozycja3 = new PozycjaZamowienia("Długopisy",7.99f);

        float sumaPozycji = pozycja1.pobierzCena()+pozycja2.pobierzCena()+pozycja3.pobierzCena();

        // brakuje wypisania nazw poszczególnych pozycji
        // toString w klasie PozycjaZamowienia

        System.out.println("=============================\n\nLista zamówień:\n\n");
        System.out.println(pozycja1.pobierzNazwa());
        System.out.println(pozycja2.toString());// metoda toString zawiera informacje o cenie
        System.out.println(pozycja3);// domyślne użycie metody toString nie trzeba jej pisać

        // czyli wystarczy
        // znak enter \n
        System.out.println("-----------");
        System.out.println(pozycja1+"\n"+pozycja2+"\n"+pozycja3);// to co powyzej tylko w jednej linii
        System.out.println("Suma pozycji :"+sumaPozycji);

    }
}
