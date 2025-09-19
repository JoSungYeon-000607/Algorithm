package baekjoon;

import java.util.Scanner;

public class Welcome_Kit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int xl = sc.nextInt();
        int xxl = sc.nextInt();
        int xxxl = sc.nextInt();
        int t_bundle = sc.nextInt();
        int p_bundle = sc.nextInt();

        int total_t = (s/t_bundle+1)+(l/t_bundle+1)+(xl/t_bundle+1)+(xxl/t_bundle+1)+(xxxl/t_bundle+1);
        int total_p = people/p_bundle;
        int remain_p = people%p_bundle;

        System.out.println(total_t);
        System.out.println(total_p+" "+remain_p);
    }
}
