package org.example.정렬;

import java.util.*;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int startIndex = commands[i][0];
            int endIndex = commands[i][1];
            int k = commands[i][2];

            List<Integer> copyList = new ArrayList();
            for (int j = startIndex - 1; j <= endIndex - 1; j++) {
                copyList.add(array[j]);
            }
            Collections.sort(copyList);

            int result = copyList.get(k - 1);
            answer[i] = result;
        }

        return answer;

    }
}
