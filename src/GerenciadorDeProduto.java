import java.util.ArrayList;
import java.util.List;


public class GerenciadorDeProduto {
    private List<Produto> produtos = new ArrayList<>();
    private int contadorId = 1;

    public void adicionarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(contadorId++, nome, preco, quantidade);
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void atualizarProduto(int id, double novoPreco, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setPreco(novoPreco);
                produto.setQuantidade(novaQuantidade);
                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    public void removerProduto(int id) {
        produtos.removeIf(produto -> produto.getId() == id);
        System.out.println("Produto removido com sucesso!");
    }
}
   

