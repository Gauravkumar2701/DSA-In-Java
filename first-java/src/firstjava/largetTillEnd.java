//Take integer inputs till the user enters 0 and print the largest number from all.

package firstjava;

import java.util.Scanner;

public class largetTillEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number or press 0 to exit: ");
        int input = scan.nextInt();
        int largest = input;
        while(input != 0){
            System.out.print("Enter the next number or press 0 to exit: ");
            input = scan.nextInt();
            if(input > largest){
                largest = input;
            }
        }
        System.out.println("The largest number till now is: "+largest);

    }
}
