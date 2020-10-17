package WejscieWyjscie;

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class ZapisDoPliku {

    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        //File write


        //continue run
        boolean runTrue = true;

        //Ask

        while (runTrue == true) {
            System.out.println("Phonebook: if you would like to stop adding contacts you should write \"end\" as a name!");

            System.out.println("Please Enter Name:");
            String nameAsk = sc.nextLine();
            if (nameAsk.equals("end")) {
                System.exit(0);
            }
            System.out.println("Please Enter Phone Number:");
               String numberAsk = sc.nextLine();

            System.out.println("Please Enter Addr:");
            String addrAsk = sc.nextLine();

            try {
                FileWriter fw = new FileWriter("E:\\JAVA\\PhoneBook.txt");
                fw.write(nameAsk+" ");
                fw.write((numberAsk)+ " ");
                fw.write(addrAsk+ " ");
                fw.close();

            } catch (IOException e) {

            }
           runTrue = true;

        }
    }

}
