package clases;

import java.util.Date;
/**
 * 
represents the following classes
 * @author sebastain camilo tovar jaramillo
 */

public class Persona {

    //attribute of our class
    private String RFC;
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    public String email;

    //class method
    public void desplegarInf() {
        System.out.println("name:" + name);
    }

    public String getName() {
        return name ;
    }

   public void setName(String name) {
       this.name = name;
       
	}

}
