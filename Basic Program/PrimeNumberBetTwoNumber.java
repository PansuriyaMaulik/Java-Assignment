import java.util.Scanner;

public class PrimeNumberBetTwoNumber {

    public static boolean isPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Starting Number:");
        int start = s.nextInt();
        System.out.println("Enter Ending Number:");
        int end = s.nextInt();
        System.out.println("List of prime number beetween " + start + " and " + end);

        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
