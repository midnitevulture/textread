/**
* Searches a document for the 'top 10 worst resume terms'
* according to a 2013 Harris Poll of employers.
* Loop calls class findIt() for each term in hireList array
* @param x the String Array to pass to class findIt
* class findIt scans 'resume.txt' and prints results
*/

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FileSearch {
    public static void main(String[] args) {

        List<String> hireList = new ArrayList<String>();

        hireList.add("Best of breed");
        hireList.add("Go-getter");
        hireList.add("Think outside of the box");
        hireList.add("Synergy");
        hireList.add("Go-to person");
        hireList.add("Thought leadership");
        hireList.add("Value add");
        hireList.add("Results-driven");
        hireList.add("Team player");
        hireList.add("Bottom-line");

        System.out.println("Scanning document for the top 10 worst resume terms according to a 2013 Harris Poll survey...\r\n");
        for (String temp : hireList) {


            try {
                findIt(temp);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void findIt(String x) throws IOException {
        int val = 0;
        System.out.print("searching for '" + x + "'...");
        Scanner input = new Scanner(System.in);

        Scanner file = new Scanner(new File("resume.txt"));

        while (file.hasNextLine()) {
            String line = file.nextLine();
            if (line.contains(x)) {
                System.out.print("\r\n The term '" + x + "' was found! \r\n");
                val = 1;
                break;
            } else {
                val = 0;
                continue;
            }
        }
        if (val == 0) {
            System.out.print("not found. \r\n");
        }



    }
}
