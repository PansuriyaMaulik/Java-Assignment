public class ReverseNumberWhile {
    public static void main(String[] args) {
        int n = 12345, reverse = 0;

        while(n != 0){
            int last = n % 10;
            reverse = reverse*10 + last;
            n = n/10;
        }
        System.out.println("The reverse of given number is " + reverse);
    }    
}
