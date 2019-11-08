package ejercicios03;
import java.util.Scanner;
public class Ejercicio0304 {
    public static void main(String[] args) {
        int n, i, mult;
        // leer un valor entero 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero entre el 1 y el 10: ");
        n = teclado.nextInt();
        
        if ( n >=0 && n <= 10){ // verifica que es un numero entre 1 y 10
            for (i = 1; i <= 10; i++ ){ // muestra la tabla de multiplicar de ese numero
                mult = n * i;
                System.out.println( n+ " x "+i+ " = " +mult);
            }
            
        }
        else {
            System.out.println("Este número no esta entre el 1 y el 10.");
        }
    }
    
}