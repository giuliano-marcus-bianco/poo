package ads.poo;

public class Caneta {
    private String cor;
    private int nivelTinta;
    private boolean aberta;

    private static final String COR_PADRAO = "preto";
    private static final int NIVEL_PADRAO = 100;
    private static final boolean TAMPA_PADRAO = false;

    public Caneta(String cor, int nivelTinta, boolean aberta) {
        this.cor = cor;
        this.nivelTinta = nivelTinta;
        this.aberta = aberta;
    } 
    
    public Caneta(String cor, int nivelTinta) {
        this(cor, nivelTinta, TAMPA_PADRAO);
    }

    public Caneta(String cor) {
        this(cor, NIVEL_PADRAO);
    }

    public Caneta() {
        this(COR_PADRAO);
    }

    public String desenhar(String simbolo, int quantidade) {
        return simbolo.repeat(quantidade);
    }

    public String desenhar(int quantidade) {
        return desenhar("-", quantidade);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }   

}
