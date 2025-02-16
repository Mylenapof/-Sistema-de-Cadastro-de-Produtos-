import java.util.Scanner;

public class SistemaCadastroSupermercado {
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciadorDeProduto gerenciador = new GerenciadorDeProduto();
    int opcao = 0;

    do {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Listar Produtos");
        System.out.println("3. Atualizar Produto");
        System.out.println("4. Remover Produto");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        
        try {
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = Double.parseDouble(scanner.nextLine());
                    System.out.print("Quantidade: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());
                    gerenciador.adicionarProduto(nome, preco, quantidade);
                    break;
                case 2:
                    gerenciador.listarProdutos();
                    break;
                case 3:
                    System.out.print("ID do Produto: ");
                    int idAtualizar = Integer.parseInt(scanner.nextLine());
                    System.out.print("Novo Preço: ");
                    double novoPreco = Double.parseDouble(scanner.nextLine());
                    System.out.print("Nova Quantidade: ");
                    int novaQuantidade = Integer.parseInt(scanner.nextLine());
                    gerenciador.atualizarProduto(idAtualizar, novoPreco, novaQuantidade);
                    break;
                case 4:
                    System.out.print("ID do Produto: ");
                    int idRemover = Integer.parseInt(scanner.nextLine());
                    gerenciador.removerProduto(idRemover);
                    break;
                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Por favor, insira um número válido.");
        }
    } while (opcao != 5);
    scanner.close();
}
}