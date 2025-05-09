package hackerrack_java;
import java.io.*;
import java.util.*;

public class Java_End_of_file {
    public static void main(String[] args) {
        /*
        Enter your code here.
        Read input from STDIN.
        Print output to STDOUT.
        Your class should be named Solution.
        */
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        // Read every token
        while(scanner.hasNext()) {
            String myString = scanner.nextLine();
            System.out.println(i + " " + myString);
            i += 1;
        }
        scanner.close();
    }

}
