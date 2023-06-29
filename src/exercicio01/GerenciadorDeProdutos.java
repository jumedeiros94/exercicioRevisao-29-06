package exercicio01;

import java.util.List;

public interface GerenciadorDeProdutos {
    void addProduto(Produto produto);
    void removerProduto(String nomeProduto);
    List<Produto> getAllProdutos();
}
