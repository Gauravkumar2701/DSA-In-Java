package firstjava;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = 1;
        for (int i = 2; i <= x; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
