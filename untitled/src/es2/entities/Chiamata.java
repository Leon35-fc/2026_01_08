package es2.entities;

public class Chiamata {
    private long numTel;
    private short durataCall;

    public short getDurataCall() {
        return durataCall;
    }

    public long getNumTel() {
        return numTel;
    }
    //COSTRUTTORE
    public Chiamata(long numTel, short durataCall) {
         this.numTel = numTel;
         this.durataCall = durataCall;
    }
}
