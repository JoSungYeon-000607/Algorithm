package baekjoon;

import java.util.Scanner;

public class StrAndChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a  = sc.nextInt();

        System.out.println(str.charAt(a-1));
    }
}
