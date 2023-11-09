import java.util.Locale;
import java.util.Scanner;

public class somaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double [] v = new double[n];
        double soma = 0;

        for (int i=0; i<v.length; i++){
            System.out.print("Digite um número: ");
            v[i]=sc.nextDouble();
            soma += v[i];
        }
        System.out.print("Valores: ");
        for (int i=0; i<v.length; i++){
            System.out.print(v[i]);
        }
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + (soma/v.length));
        sc.close();
    }
}
