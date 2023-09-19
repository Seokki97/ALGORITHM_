package org.example.programmers;

import java.util.*;

public class 최솟값만들기 {
    public int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0 ;

        while(i < A.length){
            answer += A[i] * B[B.length-1-i];
            i++;
        }
        return answer;
    }
}
