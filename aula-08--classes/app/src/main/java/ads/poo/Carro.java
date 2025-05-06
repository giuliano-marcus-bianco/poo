package ads.poo;

public class Carro {

    private double velocidadeAtual;
    private String modelo;

    private static final double VELOCIDADE_MAXIMA_PADRAO = 200;
    private static final double VELOCIDADE_ATUAL_PADRAO = 0;
    private static final String MODELO_PADRAO = "Fusca";

    public Carro() {
        this.velocidadeAtual = VELOCIDADE_ATUAL_PADRAO;
        this.modelo = MODELO_PADRAO;
    };

    public Carro(String modelo) {
        this();
        this.modelo = modelo;
    }

    public double acelerar(double incremento) {
        if (velocidadeAtual + incremento > VELOCIDADE_MAXIMA_PADRAO) {
            velocidadeAtual = VELOCIDADE_MAXIMA_PADRAO;
        } else {
            velocidadeAtual += incremento;
        }
        return velocidadeAtual;
    }

}
