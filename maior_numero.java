import java.util.Scanner;

public class maior_numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("O maior número é: " + a);
        } 
        else if (b > a && b > c) {
            System.out.println("O maior número é: " + b);
        } 
        else {
            System.out.println("O maior número é: " + c);
        }

        sc.close();
    }
}