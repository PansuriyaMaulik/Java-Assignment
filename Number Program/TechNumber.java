import java.util.Scanner;

public class TechNumber {
    public static boolean isTechNumber(int n) {
        int num, firstPart, secondPart, digits = 0, squareOfSum = 0;  

        num = n;
        while (num > 0) {
            digits++;
            num = num / 10;
        }
        if (digits % 2 == 0) {
            num = n;

            firstPart = num % (int) Math.pow(10, digits / 2);
            secondPart = num / (int) Math.pow(10, digits / 2);
            squareOfSum = (firstPart + secondPart) * (firstPart + secondPart);
            if (n == squareOfSum) {
                return true;
            } else {
                return false;
            }
        } else {
           return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = s.nextInt();

        if (isTechNumber(n)) {
        System.out.println("It is Tech number");
        } else {
        System.out.println("It is not Tech number");
        }
    }
}
