package baekjoon;

import java.util.Scanner;

public class BinoCoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BinoCoe binoCoe = new BinoCoe();
        System.out.println(binoCoe.factorial(n)/(binoCoe.factorial(m)*binoCoe.factorial(n-m)));
    }
    public int factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }
}
