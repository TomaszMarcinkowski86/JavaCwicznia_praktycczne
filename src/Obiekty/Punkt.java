package Obiekty;

public class Punkt {

  private int x,y;

    Punkt()
    {
        x=320;
        y=200;
    }
    Punkt(int wspX, int wspY){
        x=wspX;
        y=wspY;
    }
    int pobierzX(){
        return x;
    }
    int pobierzY(){
        return y;
    }
    void ustawX(int wspX){
        x=wspX;
    }
    void ustawY(int wspY){
        y=wspY;
    }
    void ustawWspolrzedne(int wspX, int wspY){
        x=wspX;
        y=wspY;
    }

    Punkt pobierzWspolrzedne(){

        Punkt punkt = new Punkt();
        punkt.x=x;
        punkt.y=y;
        return punkt;
    }
    void pobierzWspolrzedne(Punkt punkt){
        punkt.x=x;
        punkt.y=y;
    }
}
