package aula01;
import java.util.Scanner;

public class GabrielMacielAtv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

        do {
            System.out.print("Digite o nome (mais de 3 caracteres): ");
            nome = sc.nextLine();
            if (nome.length() <= 3) {
                System.out.println("Nome inválido. Insira um nome com mais de 3 caracteres.");
            }
        } while (nome.length() <= 3);

        do {
            System.out.print("Digite a idade (0 a 150): ");
            idade = sc.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida. Insira uma idade entre 0 e 150.");
            }
        } while (idade < 0 || idade > 150);

        do {
            System.out.print("Digite o salário (maior que 0): ");
            salario = sc.nextDouble();
            if (salario <= 0) {
                System.out.println("Salário inválido. Insira um valor maior que zero.");
            }
        } while (salario <= 0);

        sc.nextLine();

        do {
            System.out.print("Digite o sexo ('f' ou 'm'): ");
            sexo = sc.nextLine().toLowerCase().charAt(0);
            if (sexo != 'f' && sexo != 'm') {
                System.out.println("Sexo inválido. Insira 'f' para feminino ou 'm' para masculino.");
            }
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.print("Digite o estado civil ('s','c','v','d'): ");
            estadoCivil = sc.nextLine().toLowerCase().charAt(0);
            if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
                System.out.println("Estado civil inválido. Insira 's', 'c', 'v' ou 'd'.");
            }
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("\nCadastro concluído:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}
