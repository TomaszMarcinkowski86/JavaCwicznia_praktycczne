package Obiekty;

public class KolorowyPunkt extends Punkt {

    private int kolor;
    public KolorowyPunkt(){
        super();
        kolor=0;
    }

    public KolorowyPunkt(int wspX, int wspY, int nowyKolor){
        super(wspX,wspY);
        kolor = nowyKolor;
    }
    public void ustawKolor(int nowyKolor){
        kolor=nowyKolor;

    }
    public int pobierzKolor(){
        return kolor;
    }
}
