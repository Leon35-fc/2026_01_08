package es1.entities;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    //CONSTRUCTOR
    public Rettangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    //METHODS
    public double getPerimetro(){
        return (this.altezza + this.larghezza) * 2;
    }

    public double getArea(){
        return (this.altezza * this.larghezza);
    }

    public static void stampaRettangolo(Rettangolo rettangolo){
        System.out.println(rettangolo.getPerimetro());
        System.out.println(rettangolo.getArea());
    }
}
