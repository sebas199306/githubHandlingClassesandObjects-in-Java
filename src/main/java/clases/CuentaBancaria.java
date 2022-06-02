package clases;
/**
 * 
represents the following classes
 * @author sebastain camilo tovar jaramillo
 */

class CuentaBancaria {

       //attribute of our class
    public int acoutNumber;
    public double balance;
    public boolean activated;
    
     //class method

    public void desplegarInf() {
        System.out.println("activated:" + activated);

    }

    public boolean getActiva() {
        return activated;

    }
     public void setActiva(boolean activated) {
       this.activated = activated;
}
}
