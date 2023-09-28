package org.example.programmers;
import java.util.*;

public class 구명보트 {//몸무게 제일 적은사람이랑 제일 많은사람이 함께 타야함
    public int solution(int[] people, int limit) {
        int answer = 0;

        int start = 0 ;
        int end = people.length-1;

        Arrays.sort(people);

        while(start <= end){
            if(people[start]+people[end] <= limit){
                start++;
            }
            end--;
            answer++;
        }
        return answer;
    }
}

