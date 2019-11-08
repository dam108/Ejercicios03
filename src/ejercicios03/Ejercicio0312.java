package ejercicios03;
import java.util.Scanner;
public class Ejercicio0312 {
    public static void main(String[] args) {
        int contador = 0;
        double nota, total = 0, media= 0.0, maxima = 0.0, minima = 1000.0 , contadorAprobados = 0.0, porAprobados;
        // leer notas de examenes con decimales
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una nota del examen ( -1 para finalizar): ");
        nota = teclado.nextDouble();
        if (nota >= 0 && nota <= 10){
            while (nota != -1 ) {
                if (nota >= 0 && nota <=10){
                    contador ++;
                    total += nota;
                    // System.out.println(total);
                    media = total / (double) contador; // calculamos la media
                    /*calculamos la nota maxima*/
                    for (int i = 1; i <= contador; i ++ ){
                        if (nota > maxima){
                            maxima = nota;
                        }
                    }
                    //maxima = Math.max(nota, maxima); // calculamos la maxima
                    /*calculamos la minima*/
                    for (int i = 1; i <= contador; i ++ ){
                        if (nota < minima){
                            minima = nota;
                        }
                    }
                    //minima = Math.min(minima,nota); 
                    if (nota >= 5){ // contador de aprobados con nota >= 5
                        contadorAprobados ++;
                    }
                    if (nota == 5.0 ){
                    System.out.println("Esta nota es un 5 exacto."); // nos informa al momento del 5 exacto
                    }

                }
                else {
                    System.out.println("El numero introducido no es una nota valida");
                }
                System.out.println("Introduce una nota del examen ( -1 para finalizar): ");
                nota = teclado.nextFloat();
            }
            
            porAprobados = (contadorAprobados / (double) contador) * 100d;
            System.out.println("El porcentaje de aprobados es: "+ porAprobados+ "%.");
            System.out.println("El total de notas introducidas es: "+contador);
            System.out.println("la media de las notas es: "+media);
            System.out.println("la nota maxima es: "+maxima);
            System.out.println("la nota minima es: "+minima);
        }
        else{
             System.out.println("El numero introducido no es una nota valida");
        }    
        // -1 para finalizar
        // validar que las notas sean entre 0 y 10
        // informar del total de notas introducidas
        // calcular la nota minima, maxima, media, si hay un 5.0 exacto y el porcentaje de aprobados
    }
    
}

/*
minimo
int año; 
for (int i = 1; i <=9; i++){
año = teclado.nextInt();
if (año < menor ) menor = año;
*/