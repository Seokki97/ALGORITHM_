package org.example.programmers;

import java.util.ArrayList;
import java.util.List;

public class 프로세스 {
    public int solution(int[] priorities, int location) {
        List<Target> list = new ArrayList();

        for (int i = 0; i < priorities.length; i++) {
            list.add(new Target(priorities[i], i));
        }
        int count = 0;
        while (!list.isEmpty()) {    //11111   +1
            int value = list.get(0).getTarget();
            if (list.stream().anyMatch(x -> x.getTarget() > value)) {
                Target target = list.remove(0);
                list.add(target);
            } else {
                Target resultTarget = list.remove(0);
                count++;
                if (resultTarget.getLocation() == location) {
                    return count;
                }
            }
        }
        return count;
    }
}

class Target {
    int target;
    int location;

    public Target(int target, int location) {
        this.target = target;
        this.location = location;
    }

    public int getTarget() {
        return this.target;
    }

    public int getLocation() {
        return this.location;
    }

}

