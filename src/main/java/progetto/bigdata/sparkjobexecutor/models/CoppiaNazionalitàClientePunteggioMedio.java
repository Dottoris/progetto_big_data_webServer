package progetto.bigdata.sparkjobexecutor.models;

public class CoppiaNazionalitĂ ClientePunteggioMedio {

    private String nazionalita;
    private double punteggioMedio;

    public CoppiaNazionalitĂ ClientePunteggioMedio(String nazionalita, double punteggioMedio){
        this.nazionalita = nazionalita;
        this.punteggioMedio = punteggioMedio;
    }

    public String getNazionalita(){
        return nazionalita;
    }

    public double getPunteggioMedio(){
        return punteggioMedio;
    }
}
