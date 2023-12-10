<<<<<<< HEAD:src/stage1/Q10430.java
package stage1;
=======
package baekjoon;
>>>>>>> origin/main:src/baekjoon/Q10430.java

import java.util.Scanner;

public class Q10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}
