package clases;

public class PruebaFutbolista {

    public static void main(String[] args) {
        Futbolista primera = new Futbolista("colombiana");
        System.out.println("la nacionalidad  es: " + primera.getNationality());
        primera.nationality = "colombiana";

    }
}
