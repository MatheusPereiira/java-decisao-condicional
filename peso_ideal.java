import java.util.Scanner;

public class peso_ideal {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

            double pIH, pIM, a;

            System.out.println("A pessoa é de sexo M ou F?: ");
                String pessoa = sc.nextLine();
                String pf = pessoa.toLowerCase();

            System.out.println("Qual é a altura da pessoa?: ");
                a = sc.nextDouble();


                // talvez switch seria melhor, já que é escolha
                
                if(pf.equals("m")){
                    pIH =  (72.7 * a) - 58;
                    System.out.println("O peso ideal para essa pessoa é de: " + pIH);
                }
                else if(pf.equals("f")){
                    pIM =  (62.1 * a) - 44.7;
                    System.out.println("O peso ideal para a pessoa é de: "+ pIM);
                }
                else{
                    System.out.println("Sexo Inválido");
                }

        sc.close();              
    }
}
