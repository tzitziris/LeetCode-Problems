
public class Test {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters from left
            while (left < right && !Character.isLetter(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters from right
            while (left < right && !Character.isLetter(s.charAt(right))) {
                right--;
            }

            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "abc efg";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                System.out.println("mphke");
                continue;
            }
            System.out.println(s.charAt(i));
        }

        System.out.println(s);

    }
}