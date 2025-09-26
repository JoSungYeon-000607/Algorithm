package baekjoon;

import java.util.Scanner;

public class Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        boolean isde = true;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a==0) continue;
            if(a==1) continue;
            if(a==2) {
                cnt++;
                continue;
            }
            for (int j = 2; j < a; j++) {
                if(a%j==0) {
                    isde = false;
                    break;
                }
            }
            if(isde) cnt++;
            isde = true;
        }
        System.out.println(cnt);
    }
}
