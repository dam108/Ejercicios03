package ejercicios03;
import java.util.Scanner;
public class Ejercicio0302 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        
        // leer un numero
        System.out.println("Introduce un numero: ");
        n = teclado.nextInt();
        
        for ( int i=1; i <= n; i ++ ){ // muestra los n primeros numeros naturales
            System.out.println(i);
        }
    }
}