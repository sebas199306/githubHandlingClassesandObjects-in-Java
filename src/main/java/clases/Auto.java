package clases;

/**
 *
 * @author sebastian camilo tovar jaramillo
 */
public class Auto {
     //attribute of our class

    public String licenseplate;
    public String brand;

//Builder
    public Auto(String licenseplate, String brand) {
        this.licenseplate = licenseplate;
        this.brand = brand;
    }

//class method
    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
