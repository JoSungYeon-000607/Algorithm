package baekjoon;

import java.util.Scanner;

public class FellinDrop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String str = "a";
        while (true){
            n = sc.nextInt();
            str = String.valueOf(n);
            if(str.equals("0")) break;
            StringBuffer strBuffer = new StringBuffer(str);
            String str2 = strBuffer.reverse().toString();
            System.out.println(Integer.parseInt(str)==Integer.parseInt(str2)?"yes":"no");
        }
    }
}
