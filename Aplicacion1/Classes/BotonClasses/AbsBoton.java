package BotonClasses;

public abstract class AbsBoton {
    
    private String color;
    private double width;
    private double height;
    //Referencia a la implementacion de boton.
    private ImpBoton impBoton;

    //constructor
    public AbsBoton(ImpBoton impBoton,String color,double width,double height)
    {
        this.color = color;
        this.width = width;
        this.height = height;
        this.impBoton = impBoton;
    }

    //getters
    protected ImpBoton getImpBoton() {
        return this.impBoton;
    }

    protected String getColor() {
        return this.color;
    }

    protected double getWidth() {
        return this.width;
    }

    protected double getHeight() {
        return this.height;
    }

    //other methods
    public abstract void draw();
}
