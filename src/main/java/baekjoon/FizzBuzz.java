package baekjoon;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        int num = 0;

        if(isNum(str)) num = Integer.parseInt(str)+3;
        else if (isNum(str2)) num = Integer.parseInt(str2)+2;
        else num = Integer.parseInt(str3)+1;

        System.out.println(mkFizzBuzz(num));
    }

    static boolean isNum(String str){
        return !str.equals("Fizz") && !str.equals("Buzz") && !str.equals("FizzBuzz");
    }
    static String mkFizzBuzz(int num){
        if(num%3==0 && num%5==0) return "FizzBuzz";
        else if(num%3==0) return "Fizz";
        else if(num%5==0) return "Buzz";
        else return String.valueOf(num);
    }
}
