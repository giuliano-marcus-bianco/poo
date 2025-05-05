package ads.poo;

public class Batedeira {

    boolean ligada;
    int velocidade;
    
    public Batedeira() {
        this.ligada = false;
        this.velocidade = 0;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
        this.velocidade = 0;
    }

    public void aumentarVelocidade() {
        if (this.ligada && this.velocidade < 3) {
            this.velocidade++;
        }
    }

    public void diminuirVelocidade() {
        if (this.ligada && this.velocidade > 0) {
            this.velocidade--;
        }
    }

    public void misturar() {
        if (this.ligada) {
            System.out.println("Misturando na velocidade " + this.velocidade);
        } else {
            System.out.println("A batedeira está desligada.");
        }
    }

    public boolean isLigada() {
        return ligada;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
