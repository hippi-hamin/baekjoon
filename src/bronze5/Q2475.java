package bronze5;

import java.util.Scanner;
public class Q2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        sum = (a*a)+(b*b)+(c*c)+(d*d)+(e*e);
        System.out.println(sum%10);
    }
}
