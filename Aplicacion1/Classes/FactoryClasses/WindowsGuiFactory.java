package FactoryClasses;

import BotonClasses.BotonGrande;
import BotonClasses.BotonPequenio;
import BotonClasses.BotonWin;
import CatalogoClasses.AbsCatalogo;
import CatalogoClasses.CatalogoWin;
import TextoClasses.AbsTexto;
import TextoClasses.TextoWin;

public class WindowsGuiFactory implements SOGuiFactory {
    
    public AbsCatalogo createCatalogo(int cantProds,String[] prods,int[] prices)
    {
        return new AbsCatalogo(new CatalogoWin(),cantProds, prods, prices);
    }

    public  AbsTexto createTexto(int fontSize,String fontColor, String font)
    {
        return new AbsTexto(new TextoWin(), fontSize, fontColor, font);
    }

    public  BotonGrande createBotonGrande()
    {
        return new BotonGrande(new BotonWin());
    }
    
    public  BotonPequenio createBotonPequenio()
    {
        return new BotonPequenio(new BotonWin());
    }
}
