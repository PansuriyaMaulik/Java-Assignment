import java.util.Scanner;

public class PalindromGetNubInputConvString {

    public static boolean isPalindrome(int n) {
        String covertValue = String.valueOf(n);
        StringBuilder revString = new StringBuilder();
        revString.append(covertValue);
        revString.reverse();
        return ((revString.toString()).equals(covertValue) == true);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number or string: ");
        int n = s.nextInt();

        if(isPalindrome(n) == true) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
