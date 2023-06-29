package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class ControleCandidatos implements GerenciadorCandidatos {

    private List<Candidato> candidatos = new ArrayList<>();

    @Override
    public void addCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    @Override
    public void removerCandidato(int matricula) {
        candidatos.removeIf(candidato -> candidato.getMatricula() == matricula);
    }

    @Override
    public List<Candidato> getAllCandidatos() {
        return candidatos;
    }

}
