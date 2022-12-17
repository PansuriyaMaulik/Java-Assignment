import java.util.Scanner;

public class PrimeNumberGetInputFromUser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = s.nextInt();

        if(isPrimeNumber(n)) {
            System.out.println(n+ " is prime number");
        } else {
            System.out.println(n+ " is not prime number");
        }
    }

    public static boolean isPrimeNumber(int n) {
        if(n<=1){
            return false;
        } if (n % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}