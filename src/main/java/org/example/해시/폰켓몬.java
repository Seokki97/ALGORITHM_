package org.example.해시;

import java.util.HashMap;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int pocketNum = nums.length / 2;

        if (map.size() > pocketNum) {
            return pocketNum;
        }
        return map.size();
    }
}
