package WejscieWyjscie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // wyrzucanie danych na ekran w 1 linii
        int liczbaCalkowita = 5;
        double liczbaZmiennoprzecinkowa = 2.56;
        String lancuch = "abd";

        System.out.print(liczbaCalkowita);
        System.out.print(" ");
        System.out.print(liczbaZmiennoprzecinkowa);
        System.out.print(" ");
        System.out.print(lancuch);

        System.out.println();

        // lub
        System.out.println(liczbaCalkowita +" "+liczbaZmiennoprzecinkowa+" "+lancuch);

        // dodawanie liczb i łąńcuchów
        System.out.println(123+123);
        System.out.println("123" + "123");
        System.out.println(123 + "123");
        System.out.println("123" + 123);

        System.out.println("Wprowadź dane:");
        InputStreamReader inp=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);

        try {
            String line=br.readLine();
            System.out.println("wprowadziłeś tekst");
            System.out.println(line);
        }
        catch (IOException e){
            System.out.println("Błędny odczyt");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("wprowadź drugi tekst");
        String tekst = scanner.nextLine();

        System.out.println("Wprowadziłeś "+" \n" + tekst);

        // wprowadzanie tekstu w pętli

        String tekst2;
        System.out.println("Wprowadzasz tekst dopóki nie wpiszesz \"quit\"");
        do{
            tekst2 = scanner.nextLine();
        }while (!tekst2.equals("quit"));

        // wartości liczbowe i info o błędzie w pętli

        boolean done = false;
        do{
            
            System.out.println("Wpisz jakaś liczbę całkowitą");
            try {
                int liczba1 = scanner.nextInt();
                System.out.println("Twoja liczba to: "+ liczba1);
                done = true;
            } catch (InputMismatchException e) {
                System.out.println("nie kombinuj, nie podałeś liczby całkowitej");
                scanner.nextLine();
            }

        }while(!done);
    }

    //


}
