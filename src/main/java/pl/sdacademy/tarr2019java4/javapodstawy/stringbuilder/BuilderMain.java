package pl.sdacademy.tarr2019java4.javapodstawy.stringbuilder;

public class BuilderMain {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder().
                append("sda").append(":").
                append(1).append('r');
        System.out.println(sb);//sda:1r

        System.out.println(sb.reverse());

    }
}
