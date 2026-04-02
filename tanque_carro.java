import java.util.Scanner;

public class tanque_carro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tipo de carro (G - gasolina / A - álcool): ");
        String tc = sc.next().toLowerCase();
        System.out.println("Capacidade do tanque (litros): ");
        double ct = sc.nextDouble();

        double vg;

        // talves seja melhor com switch case também
        
        if (tc.equals("g")) {
            vg = ct * 1.80;
            System.out.printf("Total para encher com Gasolina: R$ %.2f%n", vg);
        } else if (tc.equals("a")) {
            vg = ct * 1.00;
            System.out.printf("Total para encher com Álcool: R$ %.2f%n", vg);
        } else {
            System.out.println("Tipo de combustível inválido.");
        }

        sc.close();
    }
}