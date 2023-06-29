package exercicio02;

import java.util.List;

public interface GerenciadorCandidatos {

    void addCandidato(Candidato candidato);
    void removerCandidato(int matricula);
    List<Candidato> getAllCandidatos();
}
