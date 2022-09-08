import java.util.*;

class Calculator {
   public static void main(String[] args){

    char operator;
    int a, b, result;

    Scanner sc = new Scanner(System.in);
    System.out.println("User choose the operator: ");
    operator = sc.next().charAt(0);

    System.out.println("User choose the number a: ");
    a = sc.nextInt();
    
    System.out.println("User choose the number b: ");
    b = sc.nextInt();

    switch(operator){
        case '+': result = a + b;
                System.out.println("Addition of a and b is: "+ result);
        break;
        case '-': result = a - b;
                System.out.println("Substraction of a and b is: "+ result);
        break;
        case '*': result = a * b;
                System.out.println("Multiplication of a and b is: "+ result);
        break;
        case '/': result = a / b;
                System.out.println("Division of a and b is: "+ result);
        break;
        case '%': result = a % b;
                System.out.println("Modulo of a and b is: "+ result);
        break;
        default: System.out.println("Syntay Error...Can't resolved");
       }
   }
}
