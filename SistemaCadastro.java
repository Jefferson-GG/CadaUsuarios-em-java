import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaCadastro {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n--- Sistema de Cadastro ---");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Listar usuários");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    listarUsuarios();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void cadastrarUsuario() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        Usuario novoUsuario = new Usuario(nome, email, senha, telefone);
        usuarios.add(novoUsuario);

        System.out.println("Usuário cadastrado com sucesso!");
    }

    private static void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("\n--- Usuários Cadastrados ---");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }
}
