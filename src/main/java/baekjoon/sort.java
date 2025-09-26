package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for(int i : list.stream().sorted().toArray(Integer[]::new)) {
            System.out.println(i);
        }
    }
}
