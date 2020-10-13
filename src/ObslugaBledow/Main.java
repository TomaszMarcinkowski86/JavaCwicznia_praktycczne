package ObslugaBledow;

public class Main {
    public static void main(String[] args) {
        Tablica tablica = new Tablica();

        // wyjątek z throw
//        Tablica2 tablica2 =new Tablica2();
//        int val = tablica2.getElementTab2(20);
//
//        System.out.println(val);

        try {
            int value = tablica.getElement(20);
            System.out.println("20 element tablicy to: " + value);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
            System.out.println("nie ma takieo elementu");

        }

    }
}
