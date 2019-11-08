package ejercicios03;
import java.util.Scanner;
public class Ejercicio0313 {
    public static void main(String[] args) {
        // pedir por un numero positivo
        // si no es positivo volver a pedir por un numero positivo
        int n;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero positivo: ");
        n = teclado.nextInt();
        
        do {
            System.out.println("has introducido un numero negativo.");
            System.out.println("Introduce un numero positivo: ");
            n = teclado.nextInt();
            
        } while ( n <= 0 );
        
        System.out.println("tu numero positivo: "+n);
    }
}