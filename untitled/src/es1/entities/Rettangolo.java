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

//    public String stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2){
//        double perTot = rettangolo1.getPerimetro() + rettangolo2.getPerimetro();
//        double areaTot = rettangolo1.getArea() + rettangolo2.getArea();
//        return stampaRettangolo(rettangolo1);
//        return stampaRettangolo(rettangolo2);
//        return perTot;
//        return areaTot;
//    }
}
