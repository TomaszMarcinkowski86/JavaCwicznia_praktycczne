package WejscieWyjscie;

import java.io.*;

public class OdczytZPliku {

    public static void main(String[] args) {
        String line ="";
        FileInputStream fin = null;
        try{
            fin = new FileInputStream("E:\\JAVA\\ZapisDoPliku2.txt");
        }catch (FileNotFoundException e){
            System.out.println("Brak pliku");
            System.exit(-1);
        }
        DataInputStream out = new DataInputStream(fin);
        BufferedReader br =new BufferedReader(new InputStreamReader(fin));
        try{
            while ((line= br.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Bład wejścia wyjścia");
        }
    }
}
