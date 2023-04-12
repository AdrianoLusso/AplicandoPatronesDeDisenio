package FactoryClasses;

import BotonClasses.BotonGrande;
import BotonClasses.BotonLin;
import BotonClasses.BotonPequenio;
import CatalogoClasses.AbsCatalogo;
import CatalogoClasses.CatalogoLin;
import TextoClasses.AbsTexto;
import TextoClasses.TextoLin;

public class LinuxGuiFactory implements SOGuiFactory {
    
    public AbsCatalogo createCatalogo(int cantProds,String[] prods,int[] prices)
    {
        return new AbsCatalogo(new CatalogoLin(),cantProds, prods, prices);
    }

    public  AbsTexto createTexto(int fontSize,String fontColor, String font)
    {
        return new AbsTexto(new TextoLin(), fontSize, fontColor, font);
    }

    public  BotonGrande createBotonGrande()
    {
        return new BotonGrande(new BotonLin());
    }
    
    public  BotonPequenio createBotonPequenio()
    {
        return new BotonPequenio(new BotonLin());
    }
}
