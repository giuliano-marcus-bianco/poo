package aula19.uml;

public class Motor {

    private boolean helice;
    private boolean ligado;
    
    //get e set
    public boolean isHelice() {
        return helice;
    }
    public void setHelice(boolean helice) {
        this.helice = helice;
    }
    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // construtor
    public Motor(boolean helice) {
        this.helice = helice;
    }

    // metodo liga e desliga
    public void ligaDesliga() {
        this.ligado = !ligado;
    }
    @Override
    public String toString() {
        return "Motor [helice=" + helice + "\n ligado=" + ligado + "]";
    }

    
    

}
