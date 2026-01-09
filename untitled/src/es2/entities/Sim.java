package es2.entities;


public class Sim {
    private long telNum;
    private short credito;
    private Chiamata[] chiamate;

    public long getTelNum() {
        return telNum;
    }

    public void setCredito(short credito) {
        this.credito = credito;
    }

    public short getCredito() {
        return credito;
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }

    //COSTRUTTORE
    public Sim (long telNum, short credito, String[] chiamate){
        this.telNum = telNum;
        this.credito = credito;
        this.chiamate = new Chiamata[5];
    }

}
