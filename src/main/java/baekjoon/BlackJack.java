package baekjoon;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int max = -99;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if(arr[i] + arr[j] <= M) {
                    for (int k = j + 1; k < N; k++) {
                        if (arr[i] + arr[j] + arr[k] <= M && arr[i] + arr[j] + arr[k] > max) {
                            max = arr[i] + arr[j] + arr[k];
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
