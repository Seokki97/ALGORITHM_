package org.example.programmers;

public class 예상대진표 {
    public int solution(int n, int a, int b){
        int round = 0;
        while(a!=b){
            a = (a+1)/2;
            b = (b+1)/2;
            round++;
        }
        return round;
    }
//틀린 코드
    public int soalution(int n, int a, int b){
        int round = 1 ;

        if(b>a){
            while(b-a > 1){
                if(b-a == 1){
                    break;
                }
                b = b - (b/2);
                a = a - (a/2);
                round++;
            }
        }
        if(a>b){
            while(a-b > 1){
                if(a-b == 1){
                    break;
                }
                b = b - (b/2);
                a = a - (a/2);
                round++;
            }
        }
        return round;
    }
}
