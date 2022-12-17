import java.util.Scanner;

public class ReverseNumberRecursion {
    
    public static void reverseNumberRecursion(int n){
        if(n<10){
            System.out.print(n);
            return;
        } else 
        {
            System.out.print(n%10);
            reverseNumberRecursion(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = s.nextInt();

        System.out.print("The reverse of the given number is: ");  
        reverseNumberRecursion(n);
    }
}
