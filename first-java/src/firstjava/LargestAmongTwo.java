package firstjava;

import java.util.Scanner;

public class LargestAmongTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the num1 ");
        int num1 = scan.nextInt();
        System.out.print("Enter the num2 ");
        int num2 = scan.nextInt();
        int result = num1 > num2 ? num1 : num2;
        System.out.print("The largest number is "+result);
    }
}
