package TextoClasses;

public class AbsTexto {
    private String font;
    private int fontSize;
    private String fontColor;
    private ImpTexto impTexto;

    public AbsTexto(ImpTexto impTexto, int fontSize, String fontColor, String font)
    {
        this.impTexto = impTexto; 
        this.fontSize = fontSize;
        this.fontColor = fontColor;
        this.font = font;
    }
    
    //Simula el procesamiento comun de dibujado de un texto.
    public void draw()
    {
        System.out.println("Creando el texto.");
        impTexto.draw(font, fontSize, fontColor);
    }
}
