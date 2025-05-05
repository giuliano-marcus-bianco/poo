package ads.poo;

public class Caneta {

    // Atributos
    private String cor;
    private int tinta;
    private boolean tampada;

    // Métodos
    public void setCor (String corEscolhida) {
        cor = corEscolhida;
    }

    public String getCor() {
        return cor;
    }

    public void setNivelTinta (int nivelTinta) {
        tinta = (nivelTinta > 10 || nivelTinta < 0) ? 10 : nivelTinta;        
    }

    public double getTinta() {
        return tinta;
    }

    public void tamparDestampar() {
        tampada = !tampada;
    }

    public boolean isTampada() {
        return tampada;
    }

    public String escreve(int quantidade) {

        int quantos = 0;

        if (!tampada) {
            quantos = tinta - quantidade > 0 ? "_".repeat(quantidade) : "_".repeat(tinta);
        }

        return "_".repeat(quantos);

    }


}
