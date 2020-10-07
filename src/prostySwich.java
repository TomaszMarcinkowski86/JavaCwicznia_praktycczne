import java.util.Scanner;

public class prostySwich {
    public static void main(String[] args) {

        int a;
        String b;
        Scanner scanner = new Scanner(System.in);
        try {
            do {
                System.out.println("Podaj liczbę z zakresu 1-6");

                a = scanner.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("Podałeś liczbę: " + a);
                        break;
                    case 2:
                        System.out.println("Podałeś liczbę: " + a);
                        break;
                    case 3:
                        System.out.println("Podałeś liczbę: " + a);
                        break;
                    case 4:
                        System.out.println("Podałeś liczbę: " + a);
                        break;
                    case 5:
                        System.out.println("Podałeś liczbę: " + a);
                        break;
                    case 6:
                        System.out.println("Podałeś liczbę: " + a);
                        break;
                    default:
                        System.out.println("Zapewne coś zjebałeś i przekroczyłeś zakres");

                }
            } while (a == 0 || a > 6);
        } catch (Exception e) {
            System.out.println("Nie podałeś liczby całkowtej w zakresie int.\nProgram zakończył działanie.\n" +
                    "Spróbuj jeszcze raz");
        }


    }

}
