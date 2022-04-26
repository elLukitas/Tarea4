
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el número para la criba de Erastótenes:");
        int numeroMaximo=teclado.nextInt();
        int[] vector =new int[numeroMaximo];
        System.out.println("\nVector inicial hasta :"+numeroMaximo);
        for (int i = 0; i < vector.length; i++) {
            if (i%10==0) {
                System.out.println();
            }
            System.out.print(i+1+"\t");
        }
        vector= Primos.generarPrimos(numeroMaximo);
        System.out.println("\nVector de primos hasta:"+numeroMaximo);
        for (int i = 0; i < vector.length; i++) {
            if (i%10==0) {
                System.out.println();
            }
            System.out.print(vector[i] + "\t");
        }
    }
}