public class PrimeNumberWithMethod {
    static void isPrimeNumber(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % 2 == 0) {
                    System.out.println(n + " is not prime");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime");
            }
        }
    }

    public static void main(String[] args) {
        isPrimeNumber(1);
        isPrimeNumber(3);
        isPrimeNumber(7);
    }
}
