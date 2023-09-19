package org.example.programmers;

public class 제이든케이스 {
    public String solution(String s) {
        s = s.toLowerCase();
        String[] value = s.split(" ");
        for(int i = 0 ; i < value.length; i++){
            String k = value[i].split("")[0];
            value[i] = value[i].replaceFirst(k,k.toUpperCase());

        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< value.length; i++){
            sb.append(value[i]);

            if(i < value.length-1){
                sb.append(" ");
            }
        }
        String[] k = s.split("");
        //해당부분 추가 안하면 테스트케이스 8에서 틀림
        if(k[k.length-1].equals(" ")){
            sb.append(" ");
        }

        return sb.toString();
    }
}
