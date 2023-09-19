package org.example.programmers;

public class 이진변환반복 {
    public int[] solution(String s) {
        int sum = 0;
        int count = 0;
        while (true) {
            int zeroCount = s.length();
            s = s.replaceAll("0", "");
            int length = s.length();

            sum += zeroCount - length;

            /*
            int binaryToDecimal = Integer.parseInt(x, 2); ->이진수
            int binaryToOctal = Integer.parseInt(X, 8); -> 팔진수
            int binaryToHex = Integer.parseInt(X, 16); -> 십육진수

            String binaryString = Integer.toBinaryString(i); //2진수
            String octalString = Integer.toOctalString(i);   //8진수
            String hexString = Integer.toHexString(i);       //16진수
             */
            s = Integer.toBinaryString(length);
            count++;
            if (length == 1) {
                break;
            }
        }
        int[] answer = {count, sum};

        return answer;
    }
}
