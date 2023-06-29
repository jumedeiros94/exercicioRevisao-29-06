package exercicio03;

import java.util.List;

public interface Menu {

    void addPrato(Prato prato);
    void removerPrato(String nomePrato);
    List<Prato> getAllPratos();
}
