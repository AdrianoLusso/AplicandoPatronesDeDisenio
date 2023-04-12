package BotonClasses;

public class BotonWin implements ImpBoton {
    
    public BotonWin(){}

    //Simula la implementacion comun de dibujado de un boton cualquiera, a traves de las APIs de Windows.
    public void  draw(String color,double width,double height)
    {
        System.out.println("Seteando el boton para Windows.");
    }
}
