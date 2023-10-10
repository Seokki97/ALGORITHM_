package org.example.해시;

import java.util.HashMap;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap();

        for (String k : participant) {
            map.put(k, map.getOrDefault(k, 0) + 1);
        }

        for (String a : completion) {
            map.put(a, map.getOrDefault(a, 0) - 1);
            if (map.get(a) == 0) {
                map.remove(a);
            }
        }

        return map.keySet().iterator().next();
    }
}
