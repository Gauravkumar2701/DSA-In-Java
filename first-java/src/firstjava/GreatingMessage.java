//Take name as input and print a greeting message for that name.


package firstjava;

import java.util.Scanner;

public class GreatingMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String greeting = scan.nextLine();
        System.out.println("Hello "+greeting);
    }
}
