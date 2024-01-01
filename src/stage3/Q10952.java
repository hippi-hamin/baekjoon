package stage3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        List<Integer> sum = new ArrayList<>();

        while (run) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A == 0 && B == 0) {
                break;
            }
            sum.add(A + B);
        }
        for (int i = 0; i < sum.size(); i++) {
            System.out.println(sum.get(i));
        }
    }
}

