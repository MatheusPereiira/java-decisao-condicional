import java.util.Scanner;

public class media {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
            double notaf, notaBd, notaPoo, notaSo, notaM;
            
            System.out.println("Insira a sua nota em SO I: ");
                notaSo = sc.nextDouble();
            System.out.println("Insira a sua nota BD II: ");
                notaBd = sc.nextDouble();
            System.out.println("Insira a sua nota POO 1: ");
                notaPoo = sc.nextDouble();
            
                notaf = (notaBd + notaPoo + notaSo);

                notaM = (notaf / 3);
                if(notaM >= 7){
                    System.out.println("Você foi APROVADO!, sua média foi de: " + notaM);
                }
                else{
                    System.out.println("Você foi REPROVADO!, sua média foi de: "+ notaM);
                }

        sc.close();
    }
}