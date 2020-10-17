package WejscieWyjscie;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.jetbrains.annotations.NotNull;

import javax.print.attribute.standard.Copies;
import java.io.*;

public class KopiowaniePliku {
    public static void main(String @NotNull [] args) {
        if(args.length<2){
            System.out.println("Wywołanie prgramu: "+
                    "Main nazwa_pliku_źródłowego nazwa_pliku docelowego");
            System.exit(0);
        }
        FileInputStream fin = null;
        FileOutputStream fout =null;

        try{
            fin = new FileInputStream(args[0]);
        }catch (FileNotFoundException e){
            System.out.println(" Brak pliku: "+ args[0]);
            System.exit(-1);
        }
        try{
            fout = new FileOutputStream(args[1]);
        }catch (FileNotFoundException e){
            System.out.println("Nie można utworzyć pliku: "+ args[1]);
            System.exit(-1);
        }
        try{
            int a;
            while ((a= fin.read())!=-1){
                fout.write(a);
            }
            System.out.println("Zakończono kopiowanie");
        } catch (IOException e){
            System.out.println("Błąd wejścia wyjścia");
        }
    }
}
