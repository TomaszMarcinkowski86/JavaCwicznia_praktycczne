import java.util.Scanner;

import static java.lang.Math.round;

public class rownanieKwadratowe {

    public static void main(String[] args) {

        double a, b, c;
        Scanner scA = new Scanner(System.in);
        Scanner scB = new Scanner(System.in);
        Scanner scC = new Scanner(System.in);

        System.out.println("Podaj parametry równanie kwadratowego");
        System.out.print("Podaj A: ");
        a = scA.nextDouble();
        System.out.print("Podaj B: ");
        b = scB.nextDouble();
        System.out.print("Podaj C: ");
        c = scC.nextDouble();
        System.out.println("Równanie ma postać: " + a + "x^2*" + b + "x + " + c);
        System.out.println("Delta: " + b + "^2 - 4*" + a + "*" + c);
        double delta = b * b - 4 * a * c;
        System.out.printf("Delta= %.2f\n", delta);
        double x1;
        double x2;
        if (delta < 0) {
            System.out.println("delta<0 - brak rozwiązań w zbiorze liczb rzeczywistych");
        } else if (delta == 0) {
            x1 = round(-b / 2 * a);
            System.out.printf("x=-B/2A, x= %.2f\n", x1);
        } else if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("x1=(-B+sqrt(delta))/2A, x1= %.2f\n", x1);
            System.out.printf("x2=(-B-sqrt(delta))/2A, x2=%.2f\n", x2);
        }


    }
}


