package BotonClasses;


public class BotonLin implements ImpBoton {
    
    public BotonLin(){}
    
    //Simula la implementacion comun de dibujado de un boton cualquiera, a traves de las APIs de Linux.
    public void  draw(String color,double width,double height)
    {
        System.out.println("Seteando el boton para Linux.");
    }
}
