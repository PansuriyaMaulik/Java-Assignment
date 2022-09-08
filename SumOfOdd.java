import java.util.*;

public class SumOfOdd {
    public static int sumOdd(int n){
        int sum = 0;
        for(int i=0; i<=n; i++){
            if(i/2 != 0){
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The sum of Odd Number is: "+sumOdd(5));
    }
}
