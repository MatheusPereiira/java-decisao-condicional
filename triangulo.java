import java.util.Scanner;

public class triangulo { 
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Lado A do triângulo: ");
            a = sc.nextDouble();

        System.out.println("Lado B do triângulo: ");
            b = sc.nextDouble();

        System.out.println("Lado C do triângulo: ");
            c = sc.nextDouble();


        if(a == b && a == c){
            System.out.println("O seu triângulo é equilátero! ");
        }

        else if(a != b && a != c && b != c){
            System.out.println("O seu triângulo é escaleno! ");
        }

        else {
            System.out.println("O seu triângulo é isósceles! ");
        }

        sc.close();
    } 
}
