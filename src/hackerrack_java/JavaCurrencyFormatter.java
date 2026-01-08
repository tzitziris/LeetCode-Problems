package hackerrack_java;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        // Get the currency instance
        NumberFormat nF_US = NumberFormat.getCurrencyInstance(Locale.US);
        //nF_US.setCurrency(Currency.getInstance(Locale.US));
        System.out.println("US: " + nF_US.format(payment));

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        System.out.println("India: " + india.format(payment));

        NumberFormat nF_China = NumberFormat.getCurrencyInstance(Locale.CHINA);
        //nF_China.setCurrency(Currency.getInstance(Locale.CHINA));
        System.out.println("China: " + nF_China.format(payment));

        NumberFormat nF_France = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        // nF_France.setCurrency(Currency.getInstance(Locale.FRANCE));
        System.out.println("France: " + nF_France.format(payment));

        //code up to here

        // System.out.println("US: " + us);
        // System.out.println("India: " + india);
        // System.out.println("China: " + china);
        // System.out.println("France: " + france);
    }
}
