package baekjoon;

import java.util.Scanner;

public class Right_Triangle {
    public void solve(){
        Scanner sc = new Scanner(System.in);
        while (true){
            //숫자 3개 입력
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();


            //입력받은 숫자가 전부 0일 때 입력 종료
            if(x == 0 && y == 0 && z == 0) break;

            //피타고라스의 정리 활용
            if((x * x + y * y) == z * z) {
                System.out.println("right");
            }
            else if(x * x == (y * y + z * z)) {
                System.out.println("right");
            }
            else if(y * y == (z * z + x * x)) {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }

        }
    }
    public static void main(String[] args) {
        Right_Triangle rt = new Right_Triangle();
        rt.solve();
    }
}
