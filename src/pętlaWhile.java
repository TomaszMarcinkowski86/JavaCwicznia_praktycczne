public class pętlaWhile {

    public static void main(String[] args) {

        //prosta pętla while
        int i=1;
        while(i<=5){
            System.out.println("Oarnę to");
            i++;
        }
        //liczby nieparzyste --hmm
        while(i<=20) {
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }
        //do/while - zostanie wykonana przynajmniej raz warunek sprawdzany jest po przejściu pętli
        int k=6;
        do{
            System.out.println("popełnię milion błędów i się nauczę :)");
            k++;
        }
        while(k<=5);
    }
}
