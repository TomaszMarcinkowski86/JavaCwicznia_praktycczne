public class petlaFor {

    public static void main(String[] args) {

        //najprostrsza
        for (int i = 1; i <= 3; i++) {
            System.out.println("Dasz radę !");
        }

        //zmienna iteracyjna wewnątrz pętli -- zwróć uwagę na średniki
        for (int i = 1; i <= 3; ) {
            System.out.println("a jak nie dasz ?");
            i++;
        }
        //wyrżenie warunowe i iteracyjne-- zwróć uwagę na średniki
        for (int i = 1; i++ <= 5; ) {
            System.out.println("dam radę ");
        }

        //wyrażenie pocątkowe przed pętlą
        int i=1;
        for(;i<=3;i++){
            System.out.println("dam napewno");
        }
        // petla bez wyrażeń - znowu średniki no i break bo się nie zatrzyma
        int j=1;
        for(; ; ){
            System.out.println("Po co Ci to? " );
            if(j++>=3) break;
        }
        // liczby od 1-20 nie podzielne przez 2
        for(int k=1;k<=20;k++ ){
            if(k%2==0){
                continue;
            }
            System.out.println(k);
        }
        // to samo co powyżej bez cntinue
        for(int k=1;k<=20;k++){
            if(k%2!=0){
                System.out.println(k);
            }
        }

    }
}
