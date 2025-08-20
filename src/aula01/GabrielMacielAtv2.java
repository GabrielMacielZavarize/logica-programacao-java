package aula01;
import java.util.Scanner;

public class GabrielMacielAtv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario;
        String senha;
        do {
            System.out.print("Digite o nome de usuário: ");
            usuario = sc.nextLine();

            System.out.print("Digite a senha: ");
            senha = sc.nextLine();

            if (usuario.equals(senha)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário. Tente novamente.");
            }

        } while (usuario.equals(senha));
        System.out.println("Cadastro realizado com sucesso!");
    }
}
