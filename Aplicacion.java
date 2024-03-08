
import java.util.Scanner;


/**
 *
 * @author Alumno
 */
public class Ejercicio1 {
        public static void main(String[] args) {
            Scanner entrada= new Scanner (System.in);
            
            System.out.println("Escribe un número");  
            int numero1 = entrada.nextInt ();
            System.out.println("Escribe otro número");
            int numero2=entrada.nextInt ();
            
            int suma=numero1+numero2;
            System.out.println("Resultado= "+suma);
        }
}