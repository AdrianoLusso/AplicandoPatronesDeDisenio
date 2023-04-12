package BotonClasses;

public class BotonIOS implements ImpBoton {
    
    public BotonIOS(){}

    //Simula la implementacion comun de dibujado de un boton cualquiera, a traves de las APIs de IOS.
    public void  draw(String color,double width,double height)
    {
        System.out.println("Seteando el boton para IOS.");
    }
}
