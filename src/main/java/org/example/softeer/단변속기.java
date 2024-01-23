package org.example.softeer;

import java.io .*;
import java.util .*;

public class 단변속기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] array = input.split(" ");
        int[] converted = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            converted[i] = Integer.parseInt(array[i]);
        }
        if (converted[0] == 1) {
            for (int i = 0; i < converted.length; i++) {
                if (converted[i] != i + 1) {
                    System.out.println("mixed");
                    break;
                }
                if (i == 7) {
                    System.out.println("ascending");
                    break;
                }
            }
        } else if (converted[0] == 8) {
            for (int i = 0; i < converted.length; i++) {
                if (converted[i] != 8 - i) {
                    System.out.println("mixed");
                    break;
                }
                if (i == 7) {
                    System.out.println("ascending");
                    break;
                }
            }
        }
    }

}
