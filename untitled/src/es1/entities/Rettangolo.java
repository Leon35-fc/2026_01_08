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

    public String stampaRettangolo(){
        System.out.println("L'altezza è :" + this.getAltezza());
        System.out.println("La larghezza è :" + this.getLarghezza());
        System.out.println("Il perimetro è :" + this.getPerimetro());
        System.out.println("L'area è :" + this.getArea());
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                ", altezza='" + getAltezza() + "\n" +
                "La larghezza è :" + getLarghezza() + "\n" +
                "Il perimetro è :" + getPerimetro() + "\n" +
                "L'area è :" + getArea();
    }
}
