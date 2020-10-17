package WejscieWyjscie;

import java.io.*;

public class ZpisDoPliku2 {
    public static void main(String[] args) {

        String line ="";
        FileOutputStream fout = null;

        try{
            fout = new FileOutputStream("E:\\JAVA\\ZapisDoPliku2.txt");
        }catch (FileNotFoundException e){
            System.out.println("Błąd przy otwieraniu pliku");
            System.exit(-1);
        }
        DataOutputStream out = new DataOutputStream(fout);
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        try {
            while (true) {
                if ((line = br.readLine()) == null || line.equals("end")) {
                    break;
                }
                out.writeBytes(line + '\n');
            }
        }
        catch (IOException e){
            System.out.println("Read/Wrte Error");
        }
    }
}
