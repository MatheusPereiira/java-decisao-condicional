import java.util.Scanner;

public class produtos_if_else {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

            
            System.out.println("Insira o código do produto de 1 a 10: ");
                int entrada = sc.nextInt();

            if (entrada == 1) {
                System.out.println("Alimento não perecível ");
            } 
            
            else if (entrada == 2 || entrada ==  3 ||entrada ==  4){
               System.out.println("Alimento perecível ");
            }

            else if (entrada == 5 || entrada == 6) {
                System.out.println("Vestário ");
            }

            else if (entrada == 7) {
                System.out.println("Higiene pessoal ");
            }

            else if (entrada == 8 || entrada == 9 || entrada == 10) {
                System.out.println("Utensílios domésticos ");
            }

            else {
                System.out.println("Código inválido ");
            }


        sc.close();
    }
}