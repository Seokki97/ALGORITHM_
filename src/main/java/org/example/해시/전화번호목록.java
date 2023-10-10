package org.example.해시;

import java.util.Arrays;

public class 전화번호목록 {
    //startsWith 알기, 정렬하면 바로 뒤에것만 봐도 돼서 이중포문 안써도됨
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}
