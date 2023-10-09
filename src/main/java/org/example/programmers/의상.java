package org.example.programmers;

import java.util.HashMap;

public class 의상 {
    public int solution(String[][] clothes) {
        HashMap<String,Integer> map = new HashMap();

        for(int i = 0 ; i< clothes.length; i++){
            String value = clothes[i][1];
            map.put(value,map.getOrDefault(value,0)+1);
        }
        int answer = 1;

        for(Integer i : map.values()){
            answer *= i.intValue()+1;
        }
        return answer -1;
    }
}
