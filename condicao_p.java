import java.util.Scanner;

public class condicao_p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Preço de etiqueta (PE): ");
        double pe = sc.nextDouble();
        
        System.out.println("Código da Condição de Pagamento (CP):");
        System.out.println("1 - À vista (Dinheiro/Cheque) - 10% desconto");
        System.out.println("2 - À vista (Cartão) - 5% desconto");
        System.out.println("3 - Em 2x - Preço normal");
        System.out.println("4 - Em 3x - Juros de 10%");
        int cp = sc.nextInt();

        double valorFinal;

        switch (cp) {
            case 1:
                valorFinal = pe * 0.90;
                break;
            case 2:
                valorFinal = pe * 0.95;
                break;
            case 3:
                valorFinal = pe;
                break;
            case 4:
                valorFinal = pe * 1.10;
                break;
            default:
                valorFinal = pe;
                System.out.println("Código inválido. Mantendo preço original.");
        }

        System.out.printf("O valor a ser pago é: R$ %.2f%n", valorFinal);
        sc.close();
    }
}