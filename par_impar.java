import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int poi;

            System.out.println("Digite o número: ");
                poi = sc.nextInt();

                if(poi % 2 == 0){
                    System.out.println("O número é par");
                }

                else {
                    System.out.println("O número é ímpar");

                }

        sc.close();
    }
}
