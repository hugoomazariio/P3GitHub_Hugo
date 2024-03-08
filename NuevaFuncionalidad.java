
import java.util.Scanner;

public class MiPrimerProyeto {

    public static void main(String[] args) {
        String nombre;
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Introduce tu nombre: ");
        nombre=entrada.nextLine(); //me pide por teclado que me va a escribir algo
        System.out.println("Hola "+nombre);

    }
}