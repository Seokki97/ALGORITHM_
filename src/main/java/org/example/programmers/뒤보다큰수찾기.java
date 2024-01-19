package org.example.programmers;

public class 뒤보다큰수찾기 {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList();
        for(int i = 0 ; i< numbers.length-1; i++){
            for(int j = i+1 ; j < numbers.length; j++){
                if(numbers[i] < numbers[j]){
                    list.add(numbers[j]);
                    break;
                }
                if(j == numbers.length-1){
                    list.add(-1);
                }
            }
        }
        list.add(-1);
        int[] result = new int[list.size()];
        for(int i = 0 ; i< list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
