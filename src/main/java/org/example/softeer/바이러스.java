package org.example.softeer;

import java.io.*;
import java.util.*;

public class 바이러스 {
    static int K;
    static int P;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] array = input.split(" ");
        K = Integer.parseInt(array[0]);
        P = Integer.parseInt(array[1]);
        N = Integer.parseInt(array[2]);
        long result = K;
        for (int i = 0; i < N; i++) {
            result *= P;
        }
        System.out.println(result % 1000000007);
    }
}
