package baekjoon;

import java.util.Scanner;

public class Scale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        String res = "ascending";
        if (arr[0] > arr[1]) {
            res = "descending";
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1] && res.equals("ascending")) {
                res = "mixed";
                break;
            } else if (arr[i] < arr[i + 1] && res.equals("ascending")) {
                continue;
            } else if (arr[i] < arr[i + 1] && res.equals("descending")) {
                res = "mixed";
                break;
            }
        }
        System.out.println(res);
    }
}
