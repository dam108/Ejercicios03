package ejercicios03;
public class Ejercicio0314 {
    public static void main(String[] args) {
        // informar de los numeros perfectos que hay entre 1 y 1000
        int i , j , suma;
        
        for ( i = 1; i <= 10000; i++){ // creamos el primer for para iterar todos los numeros del 1 al 10000
            suma = 0; // inicializamos el acumulador de sumas
            for(j=1; j < i ; j++){ // creamos este for para iterar todos los numeros desde 1 mientras que el sea menor que el numero de la iteracion anterior
                if (i % j == 0){ // comprobamos en cada iteracion si son divisores 
                    suma += j; // si hay un divisor lo acumulamos sumandolo a los anteriores
                }
            }
            if (i == suma ){ // si la suma de todos los divisores es igual al numero  de la primera iteracion , el numero es perfecto
            System.out.println("Este numero es perfecto: "+i);
            }
        }
    }
} 