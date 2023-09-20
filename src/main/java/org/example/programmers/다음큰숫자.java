package org.example.programmers;

public class 다음큰숫자 {
    //이거 쓰면 시간초과남 ..
    /*
 int binaryToDecimal = Integer.parseInt(x, 2); ->이진수
 int binaryToOctal = Integer.parseInt(X, 8); -> 팔진수
 int binaryToHex = Integer.parseInt(X, 16); -> 십육진수

 String binaryString = Integer.toBinaryString(i); //2진수
 String octalString = Integer.toOctalString(i);   //8진수
 String hexString = Integer.toHexString(i);       //16진수
  */

    //Integer.bitCount(k); << 이진수로 1갯수 세주는 메서드 써야 통과
    public int solution(int n) {
        int nCount = Integer.bitCount(n);
        while (true) {
            n++;
            int xCount = Integer.bitCount(n);
            if (xCount == nCount) {
                break;
            }
        }
        return n;
    }
}

