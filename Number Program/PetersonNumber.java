import java.util.Scanner;

public class PetersonNumber {
    static int[] factorial = new int[] { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600}; 

    public static boolean isPetersonNumber(int n){
        int num = n; 
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            sum += factorial[digit];
            n=n/10;
        }
        return (sum == num);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = s.nextInt();

        if(isPetersonNumber(n)){
            System.out.println("The given number is a Peterson number");
        } else {
            System.out.println("The given number is not a Peterson number");  
        }
    }
}
