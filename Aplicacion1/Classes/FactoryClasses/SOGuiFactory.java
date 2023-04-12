package FactoryClasses;

import BotonClasses.BotonGrande;
import BotonClasses.BotonPequenio;
import CatalogoClasses.AbsCatalogo;
import TextoClasses.AbsTexto;

public interface SOGuiFactory {
    
    public abstract AbsCatalogo createCatalogo(int cantProds,String[] prods,int[] prices);

    public abstract AbsTexto createTexto(int fontSize,String fontColor, String font);

    public abstract BotonGrande createBotonGrande();

    public abstract BotonPequenio createBotonPequenio();

}
