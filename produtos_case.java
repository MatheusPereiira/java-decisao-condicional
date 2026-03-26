import java.util.Scanner;

public class produtos_case {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um código de produto de 1 a 10: ");

        int valor = sc.nextInt();

        switch (valor) {
            case 1:
                System.out.println("Alimento não perecível ");
                break;

            case 2,3,4:
                System.out.println("Alimento perecível ");
                break;

            case 5,6:
                System.out.println("Vestário ");
                break;

            case 7:
                System.out.println("Higiene pessoal ");
                break;

            case 8,9,10:
                System.out.println("Utensílios domésticos ");
                break;

            default:
                System.out.println("Código inválido ");
                break;

        }

        sc.close();

    }    
}