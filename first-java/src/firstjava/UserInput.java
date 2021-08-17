//Take integer inputs till the user enters 0 and print the sum of all numbers

package firstjava;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number or press 0 to exit: ");
        int input = scan.nextInt();
        int sum = 0;
        while (input != 0){
            sum = sum + input;
            System.out.print("Enter the next number or press 0 to exit: ");
            input = scan.nextInt();
        }
        System.out.println(sum);
    }
}
