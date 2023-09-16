package org.example.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        String[] data = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(data[i]));
        }
        int result = 0;

        list.sort(Comparator.reverseOrder());
        while (true) {
            int maxSize = list.size();
            if(list.size() == 0 ){
                break;
            }
            System.out.println("리스트사이즈 :" + maxSize);
            int k = list.get(0);
            System.out.println("k :" + k);
            if (k <= maxSize) {
                for (int i = 0; i < k; i++) {
                    list.remove(0);
                }
                result++;
            } else {
                break;
            }
        }
        System.out.println(result);
    }
}
