package stage3;

import java.util.Scanner;

public class Q11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            sum = (A+B);
            System.out.println("Case #" + i + ": " + sum);
        }
    }
}
