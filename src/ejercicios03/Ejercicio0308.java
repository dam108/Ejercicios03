package ejercicios03;
import java.util.Scanner;
public class Ejercicio0308 {
    public static void main(String[] args) {
        // leer un numero 
        int suma = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n = teclado.nextInt();
        
        // calcular la suma de los siguientes 100 numeros
        for ( int i = n+1; i <= n + 100; i++){ // empieza en i = n +1 , mientras i sea igual a i +100, incrementa i
          //System.out.println(i);
            suma += i ; // creamos una variable que almacene cada vez la suma de esa variable + valor de i en cada vuelta teniendo asi un acumulador de las sumas
        }
        System.out.println("Total: "+suma);
    }
}
