package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoMenu implements Menu{

    private List<Prato> pratos = new ArrayList<>();

    @Override
    public void addPrato(Prato prato) {
        pratos.add(prato);
    }

    @Override
    public void removerPrato(String nomePrato) {
        pratos.removeIf(prato -> prato.getNome().equals(nomePrato));
    }

    @Override
    public List<Prato> getAllPratos() {
        return pratos;
    }
}
