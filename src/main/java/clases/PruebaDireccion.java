package clases;

public class PruebaDireccion {

    public static void main(String[] args) {
        Direccion D1 = new Direccion("CLL 40A #33B-28");
        System.out.println("la Direccion es: " + D1.getStreet());
        D1.street = "CLL40A #33B-28";

    }
}
