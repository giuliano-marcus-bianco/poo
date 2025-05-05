package ads.poo;

public class Personagem {
    private String nome;
    private int nivel;
    private int energia;
    private int forca;
    
    public Personagem(String nome) {
        this.nome = nome;
        this.nivel = 1;
        this.energia = 100;
        this.forca = 10;
    }
    
    public int atacar() {
        if (energia >= 10) {
            energia -= 10;
            return forca;
        } else {
            return 0;
        }
    }

    public void subirNivel() {
        nivel++;
        forca += 5;
        energia = Math.min(energia + 10, 100);
    }
    
    public void descansar() {
        energia = Math.min(energia + 20, 100);
    }
    
    public String getNome() { return nome; }
    public int getNivel() { return nivel; }
    public int getEnergia() { return energia; }
    public int getForca() { return forca; }
}
