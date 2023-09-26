package org.example.programmers;

import java.util.*;

public class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {

        List<Player> player = new ArrayList();

        for (int i = 0; i < n; i++) {
            player.add(new Player(i + 1, 0));
        }
        player.get(0).upTurn(); //첫턴은 따로 설정을 해줘야함
        for (int i = 1; i < words.length; i++) {
            int num = (i) % n; //플레이어 번호
            player.get(num).upTurn();
            String[] firstWordSplit = words[i - 1].split("");

            String firstWord = firstWordSplit[firstWordSplit.length - 1];
            String nextWord = words[i].split("")[0];

            if (!nextWord.equals(firstWord)) {
                return new int[]{player.get(num).number, player.get(num).turn};
            }
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    return new int[]{player.get(num).number, player.get(num).turn};
                }
            }
        }
        return new int[]{0, 0};
    }

    class Player {
        int turn;
        int number;

        public Player(int number, int turn) {
            this.number = number;
            this.turn = turn;
        }

        public int upTurn() {
            return this.turn++;
        }
    }
}

