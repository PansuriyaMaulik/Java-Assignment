import java.util.Scanner;

class PalindromTakeStringInput {
    public static boolean isPalindrome(String orignal) {
        int lenOrignal = orignal.length();
        String reverse = "";
        for (int i = lenOrignal-1; i >=0; i--) {
            reverse = reverse + orignal.charAt(i);
        }
        return (reverse.equals(orignal) == true);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String value: ");
        String orginal = s.nextLine();

        if(isPalindrome(orginal) == true) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}