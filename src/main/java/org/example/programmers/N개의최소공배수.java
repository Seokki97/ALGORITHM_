package org.example.programmers;

import java.util.*;

public class N개의최소공배수 {
    public int solution(int[] arr) {
        int answer = 0;
        int i = 1;
        Arrays.sort(arr);
        int lastIndex = arr.length - 1;
        boolean isTrue = false;
        while (!isTrue) {
            int value = i * arr[lastIndex];
            for (int j = 0; j < arr.length; j++) {
                if (value % arr[j] != 0) {
                    isTrue = false;
                    i++;
                    break;
                } else {
                    answer = value;
                    isTrue = true;
                }
            }
        }
        return answer;

    }
}
