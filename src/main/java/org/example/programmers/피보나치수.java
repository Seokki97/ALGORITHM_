package org.example.programmers;

import java.util.ArrayList;
import java.util.List;

public class 피보나치수 {
    //피보나치수는 값이 기하급수적으로 크기때문에 일정값이상되면
    // 오버플로우 일어남 따라서 매 연산마다 1234567 나머지를 구해줌
    public int solution(int n) {
        List<Integer> list = new ArrayList();
        list.add(0);
        list.add(1);
        for(int i =2; i<=n; i++){
            list.add((list.get(i-1)+list.get(i-2))%1234567);
        }
        return list.get(n);
    }
}
