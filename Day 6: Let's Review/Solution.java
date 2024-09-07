import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine(); // consumes the rest of the line

        for (int i = 0; i < num; i++) {
            String current = scan.nextLine();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int j = 0; j < current.length(); j++) {
                if(j % 2 == 0) {
                    sb1.append(current.charAt(j));
                } else {
                    sb2.append(current.charAt(j));
                }
            }
            System.out.printf("%s %s%n", sb1, sb2);
        } 
        scan.close();
    }
}
