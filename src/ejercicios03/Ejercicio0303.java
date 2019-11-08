package ejercicios03;
import java.util.Scanner;
public class Ejercicio0303 {
    public static void main(String[] args) {
        /* VERSION NORMAL 
        int n = 0;
        Scanner teclado = new Scanner(System.in);

        while ( n != -1 ){ // mientras n sea diferente a -1 calculamos si es par o inpar
            System.out.println("Introduce un número ( -1 para acabar): ");
            n = teclado.nextInt();
            if (n >= -1){ // comprobamos que no sea numero negativo
                if (n % 2 == 0 ){ //calculamos si es par o impar
                System.out.println("Este numero es par");
                } 
                else {
                    System.out.println("Este numero es inpar");
                }
            }
            else {
            System.out.println("Este numero es negativo.");
            }
        }
        
        FIN VERSION NORMAL */
        
        /* VERSION LECTURA ADELANTADA */
        int n;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número ( -1 para acabar): ");
        n = teclado.nextInt();
        
        while (n != -1 ) {
            if (n > -1 && n % 2 == 0){
                System.out.println("Este numero es par");
            }
            else {
                if (n > -1){
                    System.out.println("Este numero es inpar");
                }
                else {
                    System.out.println("Este numero es negativo.");
                }
            }
            System.out.println("Introduce un número ( -1 para acabar): ");
            n = teclado.nextInt();
        }
    }
}

/*

            System.out.println("Este numero es par");
            System.out.println("Este numero es inpar");
            System.out.println("Este numero es negativo.");

*/