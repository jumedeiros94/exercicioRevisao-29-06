package ModelagemDeClassePolimorfismoComposicao;

public class MainPais {

    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 8515767.049);
        brasil.setPopulacao(193946886);

        Pais argentina = new Pais("ARG", "Argentina", 2780400);
        argentina.setPopulacao(44938712);

        brasil.getPaisesFronteira().add(argentina);
        argentina.getPaisesFronteira().add(brasil);

        System.out.println("O Brasil é vizinho da Argentina? "+ brasil.ehVizinho(argentina)); // true
        System.out.println("Densidade populacional Brasil: " + brasil.getDensidadePopulacional()); // 22.75567476341677
    }

}
