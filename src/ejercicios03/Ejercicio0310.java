package ejercicios03;
import java.util.Scanner;
public class Ejercicio0310 {
    public static void main(String[] args) {
        // leer edades
        Scanner teclado = new Scanner(System.in);
        int edad;
        // parar el programa tecleando (-1)
        do {
            System.out.println("Introduce una edad ( -1 para finalizar): ");
            edad = teclado.nextInt();
            if (edad < -1) {
                System.out.println("Esta edad no es valida.");
            } else {
                if (edad >= 0 && edad <= 18) { // informar si hay menor de edad
                    System.out.println("Este alumno es menor de edad.");
                }
            }
        }
        while (edad != -1);
    }
}