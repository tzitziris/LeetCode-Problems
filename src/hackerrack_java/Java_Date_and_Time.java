package hackerrack_java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.LocalDate;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString().toUpperCase();
    }

}

public class Java_Date_and_Time {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        } catch (NullPointerException e) {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String[] dateParts = bufferedReader.readLine().trim().split(" ");

        // Input validation
        if (dateParts.length != 3) {
            System.err.println("Error: Please enter date in format: MM DD YYYY");
            return;
        }

        try {
            int month = Integer.parseInt(dateParts[0]);
            int day = Integer.parseInt(dateParts[1]);
            int year = Integer.parseInt(dateParts[2]);

            String res = Result.findDay(month, day, year).toUpperCase();
            bufferedWriter.write(res);
            bufferedWriter.newLine();
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid number format");
        } catch (Exception e) {
            System.err.println("Error: Invalid date");
        } finally {
            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
