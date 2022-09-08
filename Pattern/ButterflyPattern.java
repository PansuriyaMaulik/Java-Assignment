import java.util.*;

class ButterflyPattern{
    public static void main(String[] args){
        //Upper Half
        int n = 5;
        for(int i=1; i<=5; i++){
            //1st part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //Space
            int space = 2 * (n-i);
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }

            //2st part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Half
        for(int i=5; i>=1; i--){
            //1st part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //Space
            int space = 2 * (n-i);
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }

            //2st part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}