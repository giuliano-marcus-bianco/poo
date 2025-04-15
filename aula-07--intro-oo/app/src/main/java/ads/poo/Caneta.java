package ads.poo;

public class Caneta {

    // Atributos
    private String cor;
    private double tinta;
    private boolean tampada;

    // Métodos
    public void definirCor (String corEscolhida) {
        cor = corEscolhida;
    }

    public void definirNivelTinta (double nivelTinta) {
        tinta = nivelTinta;
    }

    public void tamparDestampar() {
        tampada = !tampada;
    }

    public boolean isTampada() {
        return tampada;
    }

    public String getCor() {
        return cor;
    }

}
