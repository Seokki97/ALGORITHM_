package org.example.programmers;

import java.util.Stack;

//문자 일때 String쓰면 거의 시간초과남 Character 로
public class 짝지어제거하기 {
    public int solution(String s) {

        Stack<Character> stack = new Stack();
        int i = 0;
        while (i <= s.length() - 1) {
            char value = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(value);
                i++;
            }//b
            else if (value == stack.peek()) {
                stack.pop();
                i++;
            } else {
                stack.push(value);
                i++;
            }
        }

        if (stack.isEmpty()) {
            return 1;
        }

        return 0;
    }
}

