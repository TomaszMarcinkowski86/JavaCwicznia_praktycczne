public class Tablice {

    public static void main(String[] args) {

        // deklaracja tablicy trójelementowej
        int[] tab1 = new int[3];

//        deklaracja z inicjalizacją
        int[] tab2 = {1,2,7,8,9,2};

        // najpierw utworzenie potem deklaracja
        int[] tab3;
        tab3 = new int[3];

        // odczyt
        System.out.println("--odczyt z tab2 ---");
        System.out.println("tab2[2] = " + tab2[2]);
        System.out.println("--odczyt z tab1 pustej ---");
        System.out.println("tab1[2] = " + tab1[2]);

        //rozmiar tablicy
        System.out.println("rozmiar tablicy: " + tab2.length);

        //Zapis
        tab3[0]=10;
        tab3[1]=120;
        tab3[2]=1;

        //odczyt foreachem
        System.out.println("odczyt foreach");
        for (int val: tab3) {
            System.out.println(val);

        }

        System.out.println("zapis i odczyt forem");
        // zapis i odczyt pętlą for
        int[] tab4 = new int[10];
        for(int i =0;i<10;i++){
            tab4[i]=i+1;
        }
        for(int i =0;i<10;i++){
            System.out.println(tab4[i]);
        }

        int[] tab5 = {9,0,2,3,4,9,2};
        int i=-1;
        System.out.println("zawartość tablicy tab5:");
        while (i++<tab5.length-1){
            System.out.println("tabica["+i+"] = "+ tab5[i]);
        }
        int[] tab6 = {9,0,2,3,4,9,2};
        int i2=0;
        System.out.println("zawartość tablicy tab6:");
        while (i2<tab5.length){
            System.out.println("tabica["+i2+"] = "+ tab6[i2]);
            i2++;
        }
    }
}
