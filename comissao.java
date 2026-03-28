import java.util.Scanner;

public class comissao{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double salario, totalV, comissao;

        salario = 1200.00;

        System.out.println("Digite o valor total vendido: ");
            totalV = sc.nextDouble();

        comissao = (totalV * 0.10);

        if(totalV >= 2000.00){
             System.out.println("Seu salário bruto e com comissão desse mês é de: " + (salario + comissao));
        }
        else {
            System.out.println("Seu salário bruto e sem comissão desse mês é de: " + salario);
        }

        sc.close();
    }
}
