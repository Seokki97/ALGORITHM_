package org.example.programmers;

import java.util.Stack;
public class 괄호회전하기 {//SubString에 대해 알아야 겠다!
    public int solution(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String k = s.substring(i, s.length()) + s.substring(0, i);
            String[] result = k.split("");
            if (isTrue(result)) {
                count++;
            }
        }

        return count;
    }

    public boolean isTrue(String[] a) {
        Stack<String> stack = new Stack();
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("(") || a[i].equals("{") || a[i].equals("[")) {
                stack.push(a[i]);
            } else {
                if (stack.isEmpty()) return false;
                if (a[i].equals(")") && !stack.peek().equals("(")) {
                    return false;
                } else if (a[i].equals("]") && !stack.peek().equals("[")) {
                    return false;
                } else if (a[i].equals("}") && !stack.peek().equals("{")) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
