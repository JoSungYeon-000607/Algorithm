package baekjoon;

import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 31;
        int m = 1234567891;
        int n = sc.nextInt();
        String str = sc.next();
        long res = 0;
        long pow = 1;

        for (int i = 0; i < n; i++) {
            int a = str.charAt(i);
            a-=96;
            res += (a*pow);
            pow = (pow*r)%m;
        }
        System.out.println(res%m);

    }
}
