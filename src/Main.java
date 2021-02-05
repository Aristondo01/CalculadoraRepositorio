import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args)
    {
        CalculadoraGeneral calcu = new Calculadora();
        try
        {
            File texto = new File("Texto.txt");
            Scanner Lector = new Scanner(texto);
            while (Lector.hasNext())
            {
                String datos = Lector.nextLine();
                System.out.println("El texto es : "+datos);
                System.out.println("El resultado es: "+calcu.Calculo(datos));
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        }
    }
}
