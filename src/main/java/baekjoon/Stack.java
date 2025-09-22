package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[100000];
        int top = 0;
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            String cmd = sc.next();
            String[] temp = cmd.split(" ");
            if(temp[0].equals("push")) {
                stack[top++] = Integer.parseInt(temp[1]);
            } else if(temp[0].equals("pop")) {
                if(top == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack[--top]);
                }
            } else if(temp[0].equals("size")) {
                System.out.println(top);
            }else if(temp[0].equals("empty")) {
                if(top == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

        }
    }
}
