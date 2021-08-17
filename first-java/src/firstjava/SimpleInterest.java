//Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.

package firstjava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int P = scan.nextInt();
        int R = scan.nextInt();
        int T = scan.nextInt();
        int simpleInt = (P*R*T)/100;
        System.out.println(simpleInt);
    }
}
