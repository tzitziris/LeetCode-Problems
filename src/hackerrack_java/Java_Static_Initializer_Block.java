package hackerrack_java;

import java.io.*;
import java.util.*;

public class Java_Static_Initializer_Block {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int height  = scanner.nextInt();
        int breadth = scanner.nextInt();

        if (height <= 0 || breadth <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(height * breadth);
        }
    }
}