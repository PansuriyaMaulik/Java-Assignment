import java.util.Scanner;

public class ArmstrongNumber {

    public static boolean armstrongNumber(int n) {
        int temp, digit = 0, last = 0, sum = 0;

        temp =n;
        while (temp != 0) {
            temp = temp / 10;
            digit++;
        }

        temp =n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digit));
            temp= temp / 10;
        }

        if(n == sum){
            return true;
        } else 
            {return false;}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        if(armstrongNumber(n) == true) {
            System.out.println("It is a ArmstrongNumber");
        } else {
            System.out.println("It is not a ArmstrongNumber");
        }
    }
}
