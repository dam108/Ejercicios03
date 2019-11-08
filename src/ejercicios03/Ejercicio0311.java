package ejercicios03;
import java.util.Scanner;
public class Ejercicio0311 {
    public static void main(String[] args) {
        int m, n, mayor = 0, menor = 0;
        boolean iguales = false;
        // leer valores enteros m y n 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor de m: ");
        m = teclado.nextInt();
        System.out.println("Introduce el valor de n: ");
        n = teclado.nextInt();
        
        // El FOR tiene que ir desde el menor de un numero hasta el mayor del otro 
        
        if (m > n ){
            menor = n;
            mayor = m;
        }
        else {
            if (m < n) {
                menor = m;
                mayor = n;
            }
            else {
                iguales = true;
            }
        }
        
        if ( !iguales) {
           for (int i = menor; i <= mayor; i++){
           System.out.println(i); 
            }
        } else {
            System.out.println("los numeros son iguales.");
        }


        /* ESTO ESTA MAL 
        // mostrar los numeros comprendidos entre ellos en valor ascendente junto con el valor de elevar cada uno de ellos al cuadrado
        if (m > n){ // si el primer numero es mayor que el segundo 
           for (int i = n; i <= m; i++){ // i = segundo numero , mientras segundo numero menor o igual que primer numero , incrementa i
               System.out.println(i);
           } 
        }
        else {
            if ( n > m ){ // si el segundo numero es mayor que el primer numero
                for (int i = m; i <= n; i++){ // i = primer numero , mientras primer numero sea menor o igual a segundo numero , incrementa i
                    System.out.println(i);
                }
            }
            else {
                System.out.println("los numeros son iguales");
            }
        }
        System.out.println("el valor de elvar m al cuadrado es " +Math.sqrt(m)); // muestra la primer numero elevado al cuadrado
        System.out.println("el valor de elvar n al cuadrado es " +Math.sqrt(n)); // muestra segundo numero elevado al cuadrado
        // utilizar una sola sentencia repetitiva tanto si m > n como si n > n  <<--- PREGUNTAR A QUE SE REFIERE
       */    
    }
}