//Input currency in rupee and output in dollar.

package firstjava;

import java.util.Scanner;

public class DollarToInr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Inr:");
        float Inr = scan.nextInt();
        float Dollar = (float) (Inr*74.38);
        System.out.println("The Dollar equivalent is: "+Dollar);
    }
}
