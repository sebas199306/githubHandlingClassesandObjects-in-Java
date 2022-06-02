package clases;

import java.util.ArrayList;
/**
 * 
represents the following classes
 * @author sebastain camilo tovar jaramillo
 */
public class Frutas {
    
     //attribute of our class

    public String name;
    public float averageWeight;
    public ArrayList<String> color;
    
     //class method

    public void desplegarInf() {
        System.out.println("color:" + color);
    }

    public ArrayList<String> getColor() {
        return color;

    }

    public void setColor(ArrayList<String> color) {
        this.color = color;

    }
}
