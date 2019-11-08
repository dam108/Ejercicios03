package ejercicios03;
public class Ejercicio0318 {
    public static void main(String[] args) {
        for (int i = 1 ; i <=9 ; i++){ 
            System.out.println("------ TABLA DEL "+i+" ------"); // pricipio de cada tabla
            for (int j = 1; j <=10; j++){
                int resultado = i * j ;
                System.out.println(i+ " x " +j+ " = " +resultado);
            }
            System.out.println("............................\n"); // final de cada tabla
        }
    }
}