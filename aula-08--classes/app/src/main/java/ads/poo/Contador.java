package ads.poo;

public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public void incrementar() {
        this.valor++;
    }

    public void atribuir(int valor) {
        this.valor = valor;
    }

    public void zerar() {
        this.valor = 0;
    }

    public int getValor() {
        return this.valor;
    }
   
}
