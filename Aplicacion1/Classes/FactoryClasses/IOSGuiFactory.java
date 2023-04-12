package FactoryClasses;

import BotonClasses.BotonGrande;
import BotonClasses.BotonIOS;
import BotonClasses.BotonPequenio;
import CatalogoClasses.AbsCatalogo;
import CatalogoClasses.CatalogoIOS;
import TextoClasses.AbsTexto;
import TextoClasses.TextoIOS;

public class IOSGuiFactory implements SOGuiFactory {
    
    public AbsCatalogo createCatalogo(int cantProds,String[] prods,int[] prices)
    {
        return new AbsCatalogo(new CatalogoIOS(),cantProds, prods, prices);
    }

    public  AbsTexto createTexto(int fontSize,String fontColor, String font)
    {
        return new AbsTexto(new TextoIOS(), fontSize, fontColor, font);
    }

    public  BotonGrande createBotonGrande()
    {
        return new BotonGrande(new BotonIOS());
    }
    
    public  BotonPequenio createBotonPequenio()
    {
        return new BotonPequenio(new BotonIOS());
    }
}
