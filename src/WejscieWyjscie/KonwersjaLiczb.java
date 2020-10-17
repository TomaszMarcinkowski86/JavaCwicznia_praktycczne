package WejscieWyjscie;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KonwersjaLiczb {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Podaj liczbę całkowitą");

        int number = 0;
        boolean isInt= false;
        do {


            try {
                number=scanner.nextInt();
                isInt=true;

            }catch (InputMismatchException e){
                System.out.println(" to nie jest number całkowita");
                scanner.next();

            }
        }while(!isInt);



        System.out.println("Liczba w systemie dziesiętnym:"+ number);
        System.out.println("Liczba w systemie ósemkowym: "+  Integer.toHexString(number));
        System.out.println("Liczba w systemie szesnastkowym: "+ Integer.toOctalString(number));
        System.out.println("Liczba w systemie binarnym: "+ Integer.toBinaryString(number));


    }

}
