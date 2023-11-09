import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Digite a quantidade de números para repetir: ");
        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < v.length; i++) {
            v[i] = ran.nextInt(20);
            System.out.println("Digite um número: "+v[i]);
        }
        int nPar = 0;
        System.out.println();
        System.out.print("Valores par: ");

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                System.out.printf("%d ", v[i]);
                nPar++;
            }
        }
        sc.close();
        System.out.printf("\n\nQuantidade de números par = %d\n", nPar);
    }
}
