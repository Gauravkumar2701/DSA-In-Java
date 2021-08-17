//Take in two numbers and an operator (+, -, *, /) and calculate the value.

package firstjava;

import java.util.Scanner;

public class smallCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the operand1");
        int operand1 = scan.nextInt();
        System.out.println("Enter the operand2");
        int operand2 = scan.nextInt();
        System.out.println("Enter the operator");
        char operator = scan.next().charAt(0);
        int result = 0;
        if(operator == '+'){
            result = operand1 + operand2;
        }else if(operator == '-'){
            result = operand1 - operand2;
        }else if(operator == '*'){
            result = operand1 * operand2;
        }else if(operator == '/'){
            result = operand1 / operand2;
        }else{
            System.out.println("Invalid Input");
        }
        System.out.println(result);


    }
}
