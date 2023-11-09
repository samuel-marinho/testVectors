import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Vectors2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i=0; i<n; i++){
            sc.nextLine();
            System.out.println("Digite o nome do produto: ");
            String name = sc.nextLine();
            System.out.println("Digite o preço do produto: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        double soma = 0;
        for (int i=0; i< vect.length; i++){
            soma += vect[i].getPrice();
        }
        double media = soma/n;
        System.out.println("A média de preço dos produtos foi: $%.2f"+media);
    }
}
