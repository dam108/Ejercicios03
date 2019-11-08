package ejercicios03;
import java.util.Scanner;
public class Ejercicio0309 {
    public static void main(String[] args) {
        int suma = 0;
        int n;
        Scanner teclado = new Scanner(System.in);
        // pedir numeros hasta que las suma de los mismos valga mas de 100
        do {
            System.out.println("Introduce un numero: ");
            n = teclado.nextInt();
            suma += n;
        }
        while(suma <= 100);
        System.out.println("La suma de los numeros introducidos es: " +suma);
    }
}