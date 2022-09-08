import java.util.*;

class SolidRombus{
    public static void main(String[] args){
        int n = 5;

        for(int i=1; i<=5; i++){
            // Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //Stars
            for(int k=1; k<=5; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}