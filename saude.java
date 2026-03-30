import java.util.Scanner;

public class saude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite a idade da pessoa: ");
                int idade = sc.nextInt();

                if(idade <= 10){
                    System.out.println("O valor a ser pago é de: R$30,00");
                }

                else if(idade <= 29){
                    System.out.println("O valor a ser pago pra quem tem " + idade + " anos é de: R$60,00");
                }

                else if(idade <= 45){
                    System.out.println("O valor a ser pago pra quem tem " + idade + " anos é de: R$120,00");
                }

                else if(idade <= 59){
                    System.out.println("O valor a ser pago pra quem tem " + idade + " anos é de: R$150,00");
                }

                else{
                    System.out.println("O valor a ser pago pra quem tem " + idade + " anos é de: R$300,00");
                }


        sc.close();
    }
}























   // int valor = sc.nextInt();

        // switch(valor){
        //     case 10
        // }