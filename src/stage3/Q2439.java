package stage3;

import java.util.Scanner;

public class Q2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String blank = " ";
        String star = "*";

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N-i; j++) {
                System.out.print(" ");
            }
            System.out.println(star);
            star += "*";
        }
    }
}
