package es1;

import es1.entities.Rettangolo;

public class es1 {
    public static void main(String[] args) {
        Rettangolo rect1 = new Rettangolo( 7, 12);
        Rettangolo rect2 = new Rettangolo( 3, 8);

        Rettangolo.stampaRettangolo(rect1);
    }
    public void stampaDueRettangoli (Rettangolo rettangolo1, Rettangolo rettangolo2){
        double perimetroTot = rettangolo1.getPerimetro() + rettangolo2.getPerimetro();
        double areaTot = rettangolo1.getArea() + rettangolo2.getArea();
        System.out.println(perimetroTot);
        System.out.println(areaTot);
    }
}
