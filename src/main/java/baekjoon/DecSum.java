package baekjoon;

import java.util.Scanner;

public class DecSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        boolean isok = false;
        for (int i = 0; i < n; i++) {
            sum = i;
            for(char c : String.valueOf(i).toCharArray()){
                sum += Integer.parseInt(String.valueOf(c));
            }
            if(n==sum) {
                System.out.println(i);
                isok = true;
                break;
            }
        }
        if(!isok) System.out.println(0);
    }
}
