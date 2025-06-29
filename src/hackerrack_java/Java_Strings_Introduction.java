package hackerrack_java;

import java.util.Scanner;

public class Java_Strings_Introduction {
    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        char firstChar = str.charAt(0);
        if (Character.isLowerCase(firstChar)) {
            firstChar = Character.toUpperCase(firstChar);
        }

        return firstChar + str.substring(1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();

        System.out.println(A.length()+B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));
    }
}
