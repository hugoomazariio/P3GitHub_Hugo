
import java.util.Scanner;


/**
 *
 * @author Alumno
 */
public class Ejercicio1 {
        public static void main(String[] args) {
            Scanner entrada= new Scanner (System.in);
            
            System.out.println("Escribe el 1º número");  
            int numero1 = entrada.nextInt ();
            System.out.println("Escribe el 2ºnúmero");
            int numero2=entrada.nextInt ();
            
            int suma=numero1+numero2;
            System.out.println("Resultado de la suma= "+suma);
        }
}