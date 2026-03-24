import java.util.Scanner;



public class emprestimo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            int numeroParcela;
            double salario, emprestimo, maximo, valorParcela;

            System.out.println("Diga o valor do empréstimo: ");
                emprestimo = sc.nextDouble();
            System.out.println("Diga a quantidade de parcelas: ");
                numeroParcela = sc.nextInt();
            System.out.println("Diga o seu salário: ");
                salario = sc.nextDouble();

            valorParcela = (emprestimo / numeroParcela);
             
            maximo = salario * 0.30;

            if(valorParcela <= maximo){
                System.out.println("Empréstimo liberado");
            }
            else{
                 System.out.println("Empréstimo bloqueado");
            }

        sc.close();
    }
}


// valor do empréstimo, número de parcelas e salário do solicitante.
// Aprovar empréstimo caso o valor das parcelas representem no máximo 30% do salário do solicitante