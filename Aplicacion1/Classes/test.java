import java.util.Random;
import java.util.Scanner;

import FactoryClasses.IOSGuiFactory;
import FactoryClasses.LinuxGuiFactory;
import FactoryClasses.SOGuiFactory;
import FactoryClasses.WindowsGuiFactory;

public class test {

    private static String[] prods = { "PC", "Calculadora", "Microprocesador", "Televisor" };
    private static int[] prices = { 100, 20, 80, 400 };

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        boolean continuar;
        Scanner keyboardIn = new Scanner(System.in);

        do
        {
            System.out.println("Testing de ejecucion de tienda virtual");
            Thread.sleep(1000);
            for(int i=0;i<3;i++)
            {
                System.out.println("Identificando sistema operativo...");
                Thread.sleep(2000);
            }
    
            //Emula la identificacion del SO de una PC cualquiera.
            switch(random.nextInt(3))
            {
                case 0: iniciarApp("Linux", new LinuxGuiFactory());break;
                case 1:   iniciarApp("Windows",new WindowsGuiFactory());break;
                case 2:  iniciarApp("IOS", new IOSGuiFactory());break;
            }

            System.out.println("Volver a testear?s/n");
            continuar =   (keyboardIn.nextLine().equals("s")? true:false);
        }while(continuar);

        keyboardIn.close();
    }


    //Inicializa la app y sus componentes GUI para el SO identificado.
    private static void iniciarApp(String so, SOGuiFactory fact) throws InterruptedException {
        System.out.println("El sistema operativo que corre la aplicacion es " + so + ". Se generaran los objetos GUI "
                + "de acuerdo a esto.");
        Thread.sleep(1000);

        fact.createBotonGrande().draw();
        Thread.sleep(500);
        fact.createBotonGrande().draw();
        Thread.sleep(500);
        fact.createBotonPequenio().draw();
        Thread.sleep(500);
        fact.createCatalogo(10, prods, prices).draw();;
        Thread.sleep(500);
        fact.createTexto(20, "blue", "comics sans").draw();;
        Thread.sleep(500);
        fact.createTexto(20, "red", "arial").draw();;
        Thread.sleep(500);
        fact.createTexto(20, "black", "lato").draw();;
        Thread.sleep(500);
        fact.createTexto(20, "black", "open sans").draw();;
    }
}
