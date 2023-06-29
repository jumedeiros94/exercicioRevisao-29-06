package exercicio01;


public class Produto {

    //Atributos

    private String nome;
    private double preco;

    //Construtores

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Getters e setters

    public String getNome() {
        return nome;
    }

    public void setName(String name) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}
