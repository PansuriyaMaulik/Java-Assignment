import java.util.Scanner;

public class NeonNumberBtnRange {
    public static boolean isneonNumber(int n) {
        int sum = 0;
        int square = n * n;

        while (square != 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }
        return (sum == n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Start Number: ");
        int start = s.nextInt();
        System.out.println("Enter End Number: ");
        int end = s.nextInt();

        for (int i = start; i <= end; i++) {
            if (isneonNumber(i) == true) {
                System.out.print(i + " ");
            }
        }
    }
}
