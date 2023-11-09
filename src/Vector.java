import java.util.Locale;
import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        float[] vect = new float[n];
        float soma = 0;
        for (int i=0; i< vect.length; i++){
            vect[i] = sc.nextFloat();
            soma += vect[i];
        }
        float avg = soma/n;
        System.out.printf("Average: %.2f", avg);
        sc.close();
    }
}
