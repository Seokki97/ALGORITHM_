package org.example.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Q2 {
    static int[] number;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String[] array = S.split("");

        number = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            number[i] = Integer.parseInt(array[i]);
        }
        //x 혹은 +만 넣을 수 있음
        // 1 6 7 8 2 -> 1 2 6 7 8

        Arrays.sort(number);

        int result = 0;
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] == 0 || number[i] == 1) {
                result = result + number[i + 1];
            } else {
                if(i == 0){
                    result = number[i];
                }
                result = result * number[i + 1];
            }
        }
        System.out.println(result);
    }
}
