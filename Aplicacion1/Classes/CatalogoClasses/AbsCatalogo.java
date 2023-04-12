package CatalogoClasses;

/*Existen dos razones para diseniar al componente Catalogo y al componente Texto utilizando el patron bridge
 1- El dominio aclara que en futuras versiones del proyecto,podran existir diferentes tipos de catalogo y textos.
 En tal caso, sera util tener ya creada la estructura Bridge y simpplemente acoplar las nuevas sublcases correspondientes.
 2-Incluso aunque no se generaran nuevos tipos de textos y catalogos, la implementacion de elementos GUI en diferentes
 SO suele ser compleja y variar lo suficiente(recordemos que en esta aplicacion no profundizamos
 sobre una creacion real de elementos GUI, solo con salidas por pantalla de ejemplo)
 */
public class AbsCatalogo {
    
    //Referencia a la implementacion de un catalogo.
    ImpCatalogo ImpCatalogo;
    int cantProdsEnPag;
    String[] prods;
    int[] prices;

    public AbsCatalogo(ImpCatalogo impCatalogo, int cantProds, String[] prods, int[] prices)
    {
        this.ImpCatalogo = impCatalogo;
        this.cantProdsEnPag = cantProds;
        this.prods = prods;
        this.prices = prices;
    }
    //Simula el procesamiento comun de dibujado de un catalogo.
    public void draw()
    {
        System.out.println("Creando un catalogo.");
        ImpCatalogo.draw(cantProdsEnPag, prods, prices);

    }
}
