import java.util.Scanner;

class ArmstrongNumberTakeUserInput {

    public static boolean isArmstrong(int n) {
        int temp, digit = 0, sum = 0, last = 0;

        temp = n;
        while (temp != 0) {
            temp = temp / 10;
            digit++;
        }

        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digit));
            temp = temp / 10;
        }

        if (sum == n) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int Start = s.nextInt();
        System.out.println("Enter Last value: ");
        int End = s.nextInt();

        System.out.println("Check Armstrong Number Beetween " + Start + " and " + End);

        for (int i = Start; i <= End; i++) {
            if (isArmstrong(i) == true) {
                System.out.print(i+ ", ");
            }
        }
    }
}