//Input a number and print all the factors of that number.

package firstjava;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = scan.nextInt();
        System.out.print("The factorial of "+input+" is:");
        for (int i = 1; i <= input; i++) {
            if(input % i == 0){
                System.out.print(" "+i+" ");
            }
        }
    }
}
