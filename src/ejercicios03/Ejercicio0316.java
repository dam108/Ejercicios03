package ejercicios03;
import java.util.Scanner;
public class Ejercicio0316 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numAdivinar, intento = 0;
        boolean acertar = false;
        System.out.println("Introduce el numero a adivinar");
        numAdivinar = teclado.nextInt();
        
        for (int j =1 ; j <=50 ; j++){ // creamos 50 lineas vacias 
            System.out.println("\n");
        }
        
        // mientras acertar sea false y intento <=5
        
        do{
            System.out.print("Introduce un número: ");
            int n = teclado.nextInt();
            
            if (n == numAdivinar) {
                System.out.println("Has acertado! ");
                acertar = true;
            } 
            else {
                ++intento;
                System.out.println("Has fallado!");
                if (n > numAdivinar ){
                    System.out.println("El numero que buscas es menor");
                }
                else {
                    System.out.println("El numero que buscas es mayor");
                }
            }
            
        } while (acertar != true && intento < 5);
        
        if (acertar != true ){
            System.out.println("Has gastado tus 5 intentos");
        }

        /*  CON FOR Y BRAKE
        
        // leer un numero a adivinar
        int numAdivinar, intento;
        boolean acertar = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero a adivinar");
        numAdivinar = teclado.nextInt();
        
        for (int j =1 ; j <=50 ; j++){ // creamos 50 lineas vacias 
            System.out.println("/n");
        }
        
        // pedir a un jugador que lo adivine
        
        // mientras intentos <5 y no hayas acertado 
        for (int i = 1; i <= 5 ; i++){
            System.out.println("introduce un numero:");
            intento = teclado.nextInt();
            
            if (intento > numAdivinar ){
                System.out.println("El numero que buscas es menor que "+intento);
            }
            else {
                if (intento < numAdivinar){
                     System.out.println("El numero que buscas es mayor que "+intento);
                }
                else {
                     System.out.println("Has Acertado");
                     acertar = true;
                     break;
                }
            }
        }
        if ( !acertar ){
            System.out.println("Has gastado tus intentos.");
        }

        // el programa indica si el numero a adivinar es mayor o menor que el introducido
        // tiene 5 intentos
        */
    
    }
    
}