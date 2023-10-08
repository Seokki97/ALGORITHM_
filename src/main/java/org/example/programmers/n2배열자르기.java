package org.example.programmers;

public class n2배열자르기 {
    //형변환!!!, 메모리 초과뜸
    public int[] solution(int n, long left, long right) {
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            array[i][i] = i + 1;
            int target = array[i][i];
            for (int j = 0; j < i; j++) {
                array[j][i] = target;
                array[i][j] = target;
            }
        }
        int[] sumArray = new int[n * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumArray[i * n + j] = array[i][j];
            }
        }
        int[] answer = new int[(int) (right - left + 1)];
        for (int i = (int) left; i <= right; i++) {
            answer[(int) (i - left)] = sumArray[i];
        }
        return answer;
    }
}
