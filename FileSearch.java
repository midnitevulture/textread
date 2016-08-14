import java.io.*;
import java.util.Scanner;

//Need to create a loop for the String.length() of the String array 'x' to be passed to findIt(String x)
//resume.txt isn't recognized from command prompt (locally), only works in IDE like IntelliJ

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
            Scanner input = new Scanner(System.in);
            //word = input.next();
            Scanner file = new Scanner(new File("C:\\hiring\\resume.txt"));

            while (file.hasNextLine()) {
                String line = file.nextLine();
                if (line.contains(x)) {
                    System.out.println(x + " was found.");
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
            System.out.println("Qutting...");


    }
}
