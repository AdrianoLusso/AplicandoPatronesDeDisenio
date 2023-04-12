package BotonClasses;

public class BotonPequenio extends AbsBoton {
    
    public BotonPequenio(ImpBoton impBoton)
    { 
       super(impBoton,"light blue",20,5);
    }

    //Simula el procesamiento comun de dibujado de un boton pequenio.
    public void draw()
    {
        System.out.println("Creando boton pequenio.");
        this.getImpBoton().draw(getColor(),getWidth(),getHeight());
    }
}
