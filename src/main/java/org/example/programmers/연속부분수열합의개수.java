package org.example.programmers;

import java.util.HashSet;
import java.util.Set;

public class 연속부분수열합의개수 {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet();
        int[] copyArray = new int[elements.length * 2];
        for (int i = 0; i < copyArray.length; i++) {
            copyArray[i] = elements[i % elements.length];
        }
        for (int size = 1; size <= elements.length; size++) {
            for (int i = 0; i < elements.length; i++) {
                set.add(getSum(i, 0, copyArray, size));
            }
        }
        return set.size();
    }

    public int getSum(int i, int num, int[] elements, int size) {
        if (size == 0) {
            return num;
        }
        return getSum(i + 1, num + elements[i], elements, size - 1);
    }
}
