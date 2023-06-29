package exercicio01;

import java.util.ArrayList;
import java.util.List;

public class ControleGerenciadorDeProdutos implements GerenciadorDeProdutos {

    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void removerProduto(String nomeProduto) {
        produtos.removeIf(produto -> produto.getNome().equals(nomeProduto));
    }

    @Override
    public List<Produto> getAllProdutos() {
        return produtos;
    }

}
