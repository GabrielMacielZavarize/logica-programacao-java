package aula01;
import java.util.Scanner;

public class GabrielMacielAtv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            double populacaoA, populacaoB, taxaA, taxaB;
            int anos = 0;

            do {
                System.out.print("Digite a população inicial do país A: ");
                populacaoA = sc.nextDouble();
                if (populacaoA <= 0) {
                    System.out.println("Erro: a população deve ser positiva.");
                }
            } while (populacaoA <= 0);

            do {
                System.out.print("Digite a taxa de crescimento anual do país A (%): ");
                taxaA = sc.nextDouble() / 100;
                if (taxaA <= 0) {
                    System.out.println("Erro: a taxa deve ser maior que 0.");
                }
            } while (taxaA <= 0);

            do {
                System.out.print("Digite a população inicial do país B: ");
                populacaoB = sc.nextDouble();
                if (populacaoB <= 0) {
                    System.out.println("Erro: a população deve ser positiva.");
                }
            } while (populacaoB <= 0);

            do {
                System.out.print("Digite a taxa de crescimento anual do país B (%): ");
                taxaB = sc.nextDouble() / 100;
                if (taxaB <= 0) {
                    System.out.println("Erro: a taxa deve ser maior que 0.");
                }
            } while (taxaB <= 0);

            if (populacaoA >= populacaoB) {
                System.out.println("A população do país A já é maior ou igual à do país B. Nenhum cálculo necessário.");
            } else {
                while (populacaoA < populacaoB) {
                    populacaoA += populacaoA * taxaA;
                    populacaoB += populacaoB * taxaB;
                    anos++;
                }
                System.out.println("Com as populações e taxas informadas, serão necessários " + anos +
                        " anos para que a população do país A ultrapasse ou se iguale à do país B.");
            }

            sc.nextLine();

            System.out.print("Deseja realizar outra simulação? (sim/não): ");
            continuar = sc.nextLine().toLowerCase();

        } while (continuar.equals("sim"));

        System.out.println("Programa encerrado. Até logo!");
    }
}
