package org.example.programmers;

import java.util.*;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        //사이즈 brown + yello 48 316
        int size = brown + yellow;
        int divideX = brown / 2;

        List<Integer> list = new ArrayList();
        for (int i = divideX - 1; i > 2; i--) {
            if (size % i == 0) {
                list.add(i);
            }
        } //avaliable 3 4 6

        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            int y = size / x;

            int count = 0;
            int zero = 0;

            count += (x - zero) * 2;
            count += (y - zero - 2) * 2;
            if (count == brown) {
                return new int[]{y, x};
            }
        }
        return null;
    }

}

