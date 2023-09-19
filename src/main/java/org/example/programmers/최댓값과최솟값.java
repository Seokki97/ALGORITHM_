package org.example.programmers;

import java.util.Arrays;

public class 최댓값과최솟값 {
    public String solution(String s) {
        String[] value = s.split(" ");
        int[] data = new int[value.length];
        for(int i = 0 ; i <value.length; i++){
            data[i] = Integer.parseInt(value[i]);
        }
        Arrays.sort(data);

        String[] result = new String[2];
        result[0] = String.valueOf(data[0]);
        result[1] = String.valueOf(data[data.length-1]);
        String answer = result[0]+" "+result[1];
        return answer;
    }
}
