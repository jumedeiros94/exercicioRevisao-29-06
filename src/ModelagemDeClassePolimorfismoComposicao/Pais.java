package ModelagemDeClassePolimorfismoComposicao;

import java.util.ArrayList;
import java.util.List;

public class Pais {

    //Atributos
    private String isoCode;
    private String nome;
    private int populacao;
    private double dimensao;
    private List<Pais> paisesFronteira;

    //Getters e setters
    public Pais(String isoCode, String nome, double dimensao) {
        this.isoCode = isoCode;
        this.nome = nome;
        this.dimensao = dimensao;
        this.paisesFronteira = new ArrayList<>();
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public List<Pais> getPaisesFronteira() {
        return paisesFronteira;
    }

    public void setPaisesFronteira(List<Pais> paisesFronteira) {
        this.paisesFronteira = paisesFronteira;
    }

    //Métodos
    public boolean ehVizinho(Pais outroPais) {
        return paisesFronteira.contains(outroPais);
    }

    public double getDensidadePopulacional() {
        return populacao / dimensao;
    }

    public List<Pais> getVizinhosComuns(Pais outroPais) {
        List<Pais> vizinhosComuns = new ArrayList<>();
        for (Pais pais : paisesFronteira) {
            if (outroPais.ehVizinho(pais)) {
                vizinhosComuns.add(pais);
            }
        }
        return vizinhosComuns;
    }
}

