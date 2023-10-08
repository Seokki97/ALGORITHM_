package org.example.programmers;

import java.util.LinkedList;

public class 캐시 {
    //LinkedList 활용
    public int solution(int cacheSize, String[] cities) {
        LinkedList<String> cache = new LinkedList();
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        int answer = 0;
        for (String city : cities) {
            city = city.toUpperCase();
            if (cache.contains(city)) {
                cache.remove(city);
                cache.addLast(city);
                answer += 1;
            } else {
                if (cache.size() == cacheSize) {
                    cache.pollFirst();
                }
                cache.addLast(city);
                answer += 5;
            }
        }
        return answer;
    }
}
