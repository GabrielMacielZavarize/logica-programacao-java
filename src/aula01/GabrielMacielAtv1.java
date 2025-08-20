package aula01;
import java.util.Scanner;

public class GabrielMacielAtv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota registrada com sucesso!");
    }
}
