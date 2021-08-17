//Write a program to print whether a number is even or odd, also take input.

package firstjava;

import java.util.Scanner;

public class evenAndOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if(input % 2 == 0){
            System.out.println("The number " + input + " is even" );
        }else {
            System.out.println("The number " + input + " is odd" );
        }

    }
}
