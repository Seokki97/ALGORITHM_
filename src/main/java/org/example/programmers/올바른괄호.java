package org.example.programmers;

import java.util.*;

public class 올바른괄호 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack();

        if (s.charAt(0) == ')') {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char a = s.charAt(i);
                if (a == '(') {
                    stack.push(a);
                }
                if (a == ')') {
                    //")"가 들어올 차례에 스택이 비어있는지 검증하는게 효율성에서 실패함
                    if (stack.isEmpty()) {
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}
