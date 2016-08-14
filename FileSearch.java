import java.io.*;
import java.util.Scanner;


public class FileSearch {
    public static void main(String[] args) {
      //  x = strings to search
        String[] x = new String[]{"Human","XXX","action"};

        try {
            findIt(x[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void findIt(String x) throws IOException {
        int val = 0;
        System.out.println(x);
        while (!x.matches("quit")) {
            Scanner input = new Scanner(System.in);
            //word = input.next();
            Scanner file = new Scanner(new File("hiring.txt"));

            while (file.hasNextLine()) {
                String line = file.nextLine();
                if (line.contains(x)) {
                    System.out.print(x + " was found.");
                    val = 1;
                    break;
                } else {
                    val = 0;
                    continue;
                }
            }
            if (val == 0) {
                System.out.println("Word does not exist");
            }
            System.out.println(x + "-------continue or quit--- enter next term or type quit");
            x = input.next();
        }
    }
}
