package clases;
/**
 * 
represents the following classes
 * @author sebastain camilo tovar jaramillo
 */
public class Direccion {
    
      //attribute of our class

    String street;
    private int number;
    private int PostalCode;
    private String location;
    private String Province;
  
    
    
     //class method

    public Direccion(String  street) {
        this. street =  street;

    }

    public String getStreet() {
        return  street;
    }

    public void setStreet(String  street) {
        this. street =  street;
    }
}
