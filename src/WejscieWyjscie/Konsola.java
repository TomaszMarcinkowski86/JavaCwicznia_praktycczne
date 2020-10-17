package WejscieWyjscie;

import java.io.Console;

public class Konsola {
    public static void main(String[] args) {
        Console console = System.console();
        if(console==null){
            System.out.println("Brak konsoli");
            System.exit(-1);

        }
        String line = console.readLine("Wprowadź tekst: ");
        console.printf("Wprowdziłeś: " + line);
    }
}
