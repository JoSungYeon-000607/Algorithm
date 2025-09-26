package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KickDown {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        int len1 = s1.length();
        int len2 = s2.length();

        // 초기 최솟값은 두 기어를 전혀 겹치지 않았을 때의 길이
        int minLength = len1 + len2;

        // s1을 기준으로 s2를 이동시킬 모든 경우를 탐색
        // shift: s1 기준 s2의 시작 위치. 음수면 s2가 s1보다 왼쪽에 있다는 의미
        for (int shift = 1 - len2; shift < len1; shift++) {

            if (canCombine(s1, s2, shift)) {
                // 결합이 가능하다면, 현재 조합의 전체 길이를 계산
                // 시작점: min(0, shift)
                // 끝점: max(len1, shift + len2)
                // 길이 = 끝점 - 시작점
                int currentLength = Math.max(len1, shift + len2) - Math.min(0, shift);
                minLength = Math.min(minLength, currentLength);
            }
        }

        System.out.println(minLength);
    }

    /**
     * s1을 기준으로 s2를 shift만큼 이동했을 때 결합이 가능한지 확인
     * @param s1 기준 문자열
     * @param s2 이동하는 문자열
     * @param shift s2의 시작 위치 (s1 기준)
     * @return 결합 가능하면 true
     */
    public static boolean canCombine(String s1, String s2, int shift) {
        // s2의 모든 문자를 순회
        for (int i = 0; i < s2.length(); i++) {
            // s2의 i번째 문자에 대응하는 s1의 인덱스 계산
            int s1_index = i + shift;

            // s1과 겹치는 구간인지 확인
            if (s1_index >= 0 && s1_index < s1.length()) {
                // '2'와 '2'가 만나면 충돌
                if (s1.charAt(s1_index) == '2' && s2.charAt(i) == '2') {
                    return false; // 결합 불가
                }
            }
        }
        return true; // 충돌 없음, 결합 가능
    }
}
