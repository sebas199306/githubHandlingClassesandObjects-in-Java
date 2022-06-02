
package clases;

import java.util.Date;

/**
 * 
represents the following classes
 * @author sebastain camilo tovar jaramillo
 */
public class Futbolista {
    
     //attribute of our class
    protected String name;
    protected int age;
    protected Date dateBirth;
    protected String nationality;
    
    
    
  //class method
    protected Futbolista(String nationality) {
        this.nationality= nationality;
    }
 
    protected String getNationality() {
        return nationality;
    }
    
}
