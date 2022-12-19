import java.util.Scanner;

public class NeonNumber {
    public static boolean isNeonNumber(int n){
        int square, sumOfSquares = 0, digit;

        square = n*n;

        while(square != 0){
            //Take the last digit of number
            digit = square % 10;
            //adds digits to the variable sum 
            sumOfSquares = sumOfSquares + digit;
            //removes the last digit of the variable square  
            square = square / 10;
        }
        return (sumOfSquares == n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = s.nextInt();

        if(isNeonNumber(n) == true){
            System.out.println("It is Neon Number");
        } else
        {
            System.out.println("It is not Neon Number");
        }
    }
}
