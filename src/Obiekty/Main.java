package Obiekty;

public class Main {


    public static void main(String[] args) {


        Punkt punkt1 = new Punkt();
        punkt1.pobierzY();
        punkt1.pobierzX();
        Punkt punkt2 = new Punkt(20,13);
        KolorowyPunkt kpunkt = new KolorowyPunkt(34,34,10);


        System.out.println("Wsp x = " + punkt1.pobierzX());
        System.out.println("Wsp y = " + punkt1.pobierzY());

        System.out.println("Wsp x = " + punkt2.pobierzX());
        System.out.println("Wsp y = " + punkt2.pobierzY());

        System.out.println("Kolorowy punkt");
        System.out.println("Wsp x = " + kpunkt.pobierzX());
        System.out.println("Wsp y = " + kpunkt.pobierzY());
        System.out.println("Kolor = "+ kpunkt.pobierzKolor());

        System.out.println();
        KlasaA obiektA=new KlasaA();
        KlasaB obiektB = new KlasaB();

        obiektA.f();
        obiektB.f();



    }
}
