
import java.util.Scanner;

public class notas_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            double notaA, notaB, notaC, media;

            System.out.println("Digite a primeira nota: ");
                notaA = sc.nextDouble();

            System.out.println("Digite a segunda nota:");
                notaB = sc.nextDouble();

            System.out.println("Digite a terceira nota:");
                notaC = sc.nextDouble();


            media = (notaA + notaB + notaC) / 3; 

            if (media >= 7){
                System.out.println("Aprovado");
            }  

            else if (media >= 3){
                   System.out.println("Você está em exame. Média atual: " + media);
            
                    System.out.println("Digite a nota do exame: ");
                    double notaExame = sc.nextDouble();
                    double mediaFinal = (notaExame + media) / 2;
                    
                    System.out.println("Média final após exame: " + mediaFinal);
                    
                    if (mediaFinal >= 5) {
                        System.out.println("Aprovado no exame");
                    } else {
                        System.out.println("Reprovado no exame");
                    }
            }
            else {
                System.out.println("Reprovado sem direito a exame");
            }

        sc.close();
    }
}
