package baekjoon;

import java.util.Scanner;

public class Factorial {
    public static float fac(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = fac(sc.nextInt());
        int temp = 0;
        while (true){
            if(n%10==0){
                temp++;
                n/=10;
            }else {
                break;
            }
        }
        System.out.println(temp);
    }
}
