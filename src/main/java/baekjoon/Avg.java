package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Avg {
    public static void main(String[] args) throws IOException {

        // 1. BufferedReader를 사용하여 입력을 받습니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2. StringBuilder를 사용하여 출력을 모아둡니다.
        StringBuilder sb = new StringBuilder();

        int C = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int i = 0; i < C; i++) {
            // 3. StringTokenizer로 한 줄을 읽어 공백 단위로 자릅니다.
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken()); // 학생 수
            int[] scores = new int[N];
            double sum = 0; // 합계는 double로 선언하여 정확도 확보

            // 점수를 배열에 저장하고 합계를 구합니다.
            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }

            // (해결) 평균을 double로 정확하게 계산합니다.
            double avg = sum / N;
            double overAvgCount = 0;

            // 평균을 넘는 학생 수를 셉니다.
            for (int score : scores) {
                if (score > avg) {
                    overAvgCount++;
                }
            }

            // 비율을 계산하고 StringBuilder에 추가합니다.
            double ratio = (overAvgCount / N) * 100;
            sb.append(String.format("%.3f%%", ratio)).append('\n');
        }

        // 모든 테스트 케이스가 끝난 후 한 번에 출력합니다.
        System.out.print(sb);
    }
}
