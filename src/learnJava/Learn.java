package learnJava;

public class Learn {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2); // true  → δείχνουν στο ίδιο αντικείμενο (pool)
        System.out.println(s1 == s3); // false → διαφορετικά αντικείμενα
        System.out.println(s1.equals(s3)); // true → ίδια περιεχόμενα

    }
}
