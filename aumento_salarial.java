import java.util.Scanner;

public class xkm{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

            int anosT;
            double salario, novoS20, novoS10;
            

            System.out.println("Digite os anos trabalhados na empresa: ");
                anosT = sc.nextInt();
            System.out.println("Digite o salário atual: ");
                salario = sc.nextInt();


            if(anosT >= 5){
                novoS20 = (salario * 1.20);
                System.out.println("O novo salário é de: " + novoS20);
            }
            else{
                novoS10 = (salario * 1.10);
                System.out.println("O novo salário é de: " + novoS10);
            }

        sc.close();
    }
}