import java.util.Scanner;


public class idade {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int idade;

     System.out.println("Insira a sua idade: ");
      idade = sc.nextInt();
       if (idade < 18) {
           System.out.println("Você é menor de idade, entrada não permitida!");
       }
         else{
             System.out.println("Seja Bem-Vindo ao Budha Garden!");
         }

     sc.close();
    }

}
