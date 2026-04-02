import java.util.Scanner;

public class notas {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

            double notaA, notaB, media;

            System.out.println("Digite a primeira nota: ");
                notaA = sc.nextDouble();

            System.out.println("Digite a segunda nota: ");
                notaB = sc.nextDouble();

            media = (notaA + notaB) / 2;

            if (media == 10 ) {
                System.out.println("Aprovado com distinção");
            }

            else if (media >= 7) {
                System.out.println("Aprovado");
            }

            else if (media >= 3) {
                System.out.println("Exame");
            }

            else {
                System.out.println("Reprovado");
            }

        sc.close();
    }
}
