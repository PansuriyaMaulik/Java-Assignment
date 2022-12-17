import java.util.Scanner;

public class ReverseNumberLoop {
    public static void reverseNumber(int n){
        int reverse=0;

        for(; n!=0; n=n/10){
            int lastDigit = n%10;
            reverse = reverse*10 + lastDigit;
        }
        System.out.println("The reverse of given number is " + reverse);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = s.nextInt();

        System.out.print("The reverse of the given number is: ");
        reverseNumber(n);
    }
}
