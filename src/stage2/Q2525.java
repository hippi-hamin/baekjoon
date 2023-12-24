package stage2;

import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (C >= 60) {
            int a = C / 60;
            int b = C % 60;
            A = A + a; // 31
            B = B + b; // 70
            if (B < 60) {
                B = B;
            } else if (B > 59) {
                B = B - 60;
                A = A + 1;
            }
        } else if (C < 60) {
            B = B + C;
            if (B < 60) {
                B = B;
            } else if (B > 59) {
                B = B - 60;
                A = A + 1;
            }
        }
        if (A > 23) {
            A = A - 24;
        }
        System.out.print(A + " ");
        System.out.println(B);
    }
}
