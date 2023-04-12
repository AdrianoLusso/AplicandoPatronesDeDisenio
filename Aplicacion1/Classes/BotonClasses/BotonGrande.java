package BotonClasses;

public class BotonGrande extends AbsBoton {
    
    //Constr
    public BotonGrande(ImpBoton impBoton)
    { 
       super(impBoton,"blue",100,50);
    }

    //Simula el procesamiento comun de dibujado de un boton grande.
    public void draw()
    {
        System.out.println("Creando el boton grande.");
        this.getImpBoton().draw(getColor(),getWidth(),getHeight());
    }
}
