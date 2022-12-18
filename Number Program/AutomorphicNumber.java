import java.util.Scanner;

public class AutomorphicNumber {
    public static boolean isAutomorphic(int n){
        int square = n * n;

        while(n>0){
            if(n%10 != square%10)
            return false;

            n = n/10;
            square = square/10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = s.nextInt();

        if(isAutomorphic(n) == true){
            System.out.println("It is Automorphic");
        } else 
        {
            System.out.println("It is not Automorphic");
        }
    }
}
