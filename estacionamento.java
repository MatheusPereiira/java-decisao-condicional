import java.util.Scanner;

public class estacionamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrada (hora e minuto):");
        int he = sc.nextInt();
        int me = sc.nextInt();
        System.out.println("Saída (hora e minuto):");
        int hs = sc.nextInt();
        int ms = sc.nextInt();

        int momentoEntrada = (he * 60) + me;
        int momentoSaida = (hs * 60) + ms;
        int diferencaMinutos = momentoSaida - momentoEntrada;

        int horasCobradas = (int) Math.ceil(diferencaMinutos / 60.0);

        double pag;
        if (horasCobradas <= 1) {
            pag = 4.00;
            
        } else if (horasCobradas == 2) {
            pag = 6.00;

        } else {
            pag = 6.00 + (horasCobradas - 2) * 1.00;
        }

        System.out.println("Total de horas: " + horasCobradas);
        System.out.printf("Valor a pagar: R$ %.2f%n", pag);
        sc.close();
    }
}