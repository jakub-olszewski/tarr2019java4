package pl.sdacademy.tarr2019java4.javapodstawy.dataiczas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataICzasMain {

    public static void main(String[] args) {

        LocalDateTime terazDateTime = LocalDateTime.now();// tworzenie daty
        System.out.println("Teraz jest "+terazDateTime);// wypisanie daty

        String formatDaty = "yyyy-MM-dd HH:mm:ss";
        String czasPosilku = "2019-12-01 13:00:00";
        // Zadanie
        // zamienić czas posilku na date wedlug formatu
        DateTimeFormatter formater = DateTimeFormatter.ofPattern(formatDaty);
        // formater do formatowania daty zawiera on w argumencie wzór formatu
        LocalDateTime dataDateTime = LocalDateTime.parse(czasPosilku,formater);
        // data w formacie kodu Java czytelna dla interpretatora
        //dataDateTime.isBefore() // na LocalDateTime możemy wykonywać metody dostępne na dacie

        // Zadanie
        // wyswietlic date obecną według formatu
        String dataJakoNapis = terazDateTime.format(formater);// formatujemy za pomocą formatera

        // wypisanie informacji o dacie przy użyciu StringBuilder
        StringBuilder informacja = new StringBuilder();
        informacja.append("Data jako napis według formatu :"+formatDaty).append("\n");
        informacja.append(dataJakoNapis);

        System.out.println(informacja);

    }
}
