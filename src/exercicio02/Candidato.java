package exercicio02;

public class Candidato {

    //Atributos

    private int matricula;
    private double nota;

    //Construtor

    public Candidato(int matricula, double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }

    //Getters e setters


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
