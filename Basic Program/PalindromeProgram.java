import java.util.Scanner;

class PalindromeProgram {

    public static boolean isPalindrome(int n){
        int reverse = 0;
        int temp=n;

        while(temp != 0){
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
    }
    return true;
}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string or number:");
        int n = s.nextInt();

        if(isPalindrome(n) == true) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
 }