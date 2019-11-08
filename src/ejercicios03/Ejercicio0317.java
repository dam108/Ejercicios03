    /* ¿Hay que solicitarle al usuario
        siempre las notas de los nueve módulos? 
    NO , SI ALGUNA NOTA DE UN MODULO ESTA SUSPENSA YA NO SE NECESITA PEDIR MAS NOTAS
    */
package ejercicios03;
import java.util.Scanner;
public class Ejercicio0317 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 1;
        double nota ;
        boolean suspenso = false;
        // pedir las notas en los nueve modulos de un ciclo

        do {
            System.out.println("Intoduce la nota del modulo " + contador + ": ");
            nota = teclado.nextInt();
            contador ++;
            
            if (nota < 5){
                suspenso = true;
            }
 
        } while (!suspenso  && contador <= 9);
        
        if (suspenso){
            System.out.println("No va a la FCT");
        }
        else {
            System.out.println("Si va a la FCT");
        }
        // informar si puede ir a la FCT ( todo aprobado)
    }
    
}