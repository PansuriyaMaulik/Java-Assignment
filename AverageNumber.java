import java.util.*;

public class AverageNumber{
 public static int averageNumber(int a, int b, int c){
     int avg = (a+b+c)/3;
     return avg;
 }
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();

     int avg = averageNumber(a, b, c);
     System.out.println("The average of three Number is: "+avg);
 }   
}