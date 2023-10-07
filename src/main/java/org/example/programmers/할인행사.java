package org.example.programmers;

import java.util.ArrayList;
import java.util.List;
//객체 참조복사 이슈.. 완전히 복사를 해야함
public class 할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        List<Item> itemList = new ArrayList();

        for (int i = 0; i < want.length; i++) {
            itemList.add(new Item(want[i], number[i]));
        }
        int result = 0;

        for (int i = 0; i < discount.length; i++) {
            List<Item> copyList = new ArrayList();
            for (Item item : itemList) {
                copyList.add(new Item(item));
            }
            copyList = play(copyList, discount, i);

            boolean allZero = true;
            for (int j = 0; j < copyList.size(); j++) {
                if (copyList.get(j).getWishNumber() != 0) {
                    allZero = false;
                    break;
                }
            }
            if (allZero) {
                result++;
            }
        }
        return result;
    }

    public List<Item> play(List<Item> itemList, String[] discount, int k) {
        for (int i = 0; i < itemList.size(); i++) {
            Item item = itemList.get(i);
            int count = 0;
            for (int j = k; j < discount.length && count < 10; j++) {
                if (item.getWishItem().equals(discount[j])) {
                    item.reduceWishNumber();
                }
                count++;
            }
        }
        return itemList;
    }
}

class Item {
    String wishItem;

    int wishNumber;

    public Item(String wishItem, int wishNumber) {
        this.wishItem = wishItem;
        this.wishNumber = wishNumber;
    }

    public Item(Item other) {
        this.wishItem = other.wishItem;
        this.wishNumber = other.wishNumber;
    }

    public void reduceWishNumber() {
        this.wishNumber = this.wishNumber - 1;
    }

    public String getWishItem() {
        return this.wishItem;
    }

    public int getWishNumber() {
        return this.wishNumber;
    }
}
