import java.util.Scanner;

public class SunnyNumber {
    static boolean findPerfectSquare(double n){
        double sqrRoot = Math.sqrt(n);
        return ((sqrRoot - Math.floor(sqrRoot) == 0));
    }

    static void isSunnyNumber(int N){
        if(findPerfectSquare(N + 1))
        {
            System.out.println("The given number is sunny number");
        } else {
            System.out.println("The given number is not sunny number");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = s.nextInt();

        isSunnyNumber(N);
    }
}
