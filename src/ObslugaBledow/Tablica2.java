package ObslugaBledow;

public class Tablica2 {
    int[] tablica2;

    public Tablica2() {
        tablica2 = new int[5];
    }
        int getElementTab2 ( int index2){
            if (index2 <= 0 || index2 > 5) {
                throw new ArrayIndexOutOfBoundsException("Indeks poza zakresem.");
            }
            return tablica2[index2];
        }
    }

