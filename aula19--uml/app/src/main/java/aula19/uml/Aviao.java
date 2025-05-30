package aula19.uml;

import java.util.ArrayList;

public class Aviao {

    private int maxTripulantes;
    private int maxPassageiros;
    private double pesoMaximo;
    private double combustivelMaximo;
    private ArrayList<Motor> motores;

    public int getMaxTripulantes() {
        return maxTripulantes;
    }
    public void setMaxTripulantes(int maxTripulantes) {
        this.maxTripulantes = maxTripulantes;
    }
    public int getMaxPassageiros() {
        return maxPassageiros;
    }
    public void setMaxPassageiros(int maxPassageiros) {
        this.maxPassageiros = maxPassageiros;
    }
    public double getPesoMaximo() {
        return pesoMaximo;
    }
    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
    public double getCombustivelMaximo() {
        return combustivelMaximo;
    }
    public void setCombustivelMaximo(double combustivelMaximo) {
        this.combustivelMaximo = combustivelMaximo;
    }
 
    private void setMotores(int numeroMotores, boolean helice) {
        if(numeroMotores >= 1 && numeroMotores <=8) {
            for (int i = 0; i < numeroMotores; i++) {
                this.motores.add(new Motor(helice));
            }
        }
    }

    public Aviao(int maxTripulantes, int maxPassageiros, double pesoMaximo, double combustivelMaximo,
            int numeroMotores, boolean helice) {
        setMaxTripulantes(maxTripulantes);
        setMaxPassageiros(maxPassageiros);
        setPesoMaximo(pesoMaximo);
        setCombustivelMaximo(combustivelMaximo);
        this.motores = new ArrayList<>();
        setMotores(numeroMotores, helice);
    }

    public void ligaDesliga() {
        for (Motor motor : motores) {
            motor.ligaDesliga();            
        }
    }
    
    @Override
    public String toString() {
        return "Aviao [maxTripulantes=" + maxTripulantes + "\n maxPassageiros=" + maxPassageiros + "\n pesoMaximo="
                + pesoMaximo + "\n combustivelMaximo=" + combustivelMaximo + "\n motores=" + motores + "]";
    }

    
    

}
