package ejercicios03;
import java.util.Scanner;
public class Ejercicio0305 {
    public static void main(String[] args) {
        int n = 0, total = 0;
        // sumar una candidad de números se van introduciendo
        
        Scanner teclado = new Scanner(System.in);
        
        // para programa si se teclea -1
        System.out.println("introduce un numero: ");
        n = teclado.nextInt();
        
        while (n != -1){
            total = total + n;
            System.out.println("introduce un numero: ");
            n = teclado.nextInt();

        }
        System.out.println("la suma de todos los numeros es: " +total);
    } // fin static 
} // fin class