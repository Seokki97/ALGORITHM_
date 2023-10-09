package org.example.programmers;

import java.util.*;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] time = new int[progresses.length];
        List<Integer> list = new ArrayList();

        for (int i = 0; i < time.length; i++) {
            int remained = (100 - progresses[i]);
            if (remained % speeds[i] != 0) {
                list.add(remained / speeds[i] + 1);
            } else {
                list.add(time[i] = remained / speeds[i]);
            }
        }
        // 5 10 1 1 20 1
        List<Integer> result = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            int now = list.get(i);
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) > now) {
                    break;
                }
                count++;
                i = j;
            }
            result.add(count);
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
