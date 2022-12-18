import java.util.Scanner;

class AutomorphicNumberBtnNumber {
    public static boolean isAutomorphic(int n) {
        int count = 0;

        int square = n * n;
        int temp = n;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int lastDigit = (int) (square % (Math.pow(10, count)));
        return n == lastDigit;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the start value: ");
        int start = s.nextInt();
        System.out.println("Enter the end value: ");
        int end = s.nextInt();
        System.out.println("Automorphic numbers between " + start + " and " + end + " are: ");

        for (int i = start; i <= end; i++) {
            if (isAutomorphic(i))
                System.out.print(i + " ");
        }
    }
}