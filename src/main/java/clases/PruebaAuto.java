package clases;

/**
 *
 * @author sebastian camilo tovar jaramillo
 */
public class PruebaAuto {

    public static void main(String[] args) {
        Auto auto1 = new Auto("XYZ-2", "BMW");
        Auto auto2 = new Auto("ABC-1", "LAMBORGHINI");

        System.out.println("Datos del Auto 1");
        System.out.println("Placa: " + auto1.getLicenseplate());
        System.out.println("Marca: " + auto1.getBrand());

        System.out.println("Datos del Auto 2");
        System.out.println("Placa: " + auto2.getLicenseplate());
        System.out.println("Marca: " + auto2.getBrand());

    }

}
