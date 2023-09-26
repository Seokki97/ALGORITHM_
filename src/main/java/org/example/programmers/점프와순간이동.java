package org.example.programmers;

public class 점프와순간이동 {
    public int solution(int n) {

        int count = 0 ;
        while(n > 0){
            if(n%2 == 0){
                n = n/2;
            }
            if(n%2 != 0){
                n = n-1;
                count++;
            }
        }
        return count;
    }
}
