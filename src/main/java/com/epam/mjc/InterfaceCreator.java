package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list -> {
            List<Integer> afterDividingList = new ArrayList<>();
            for (int number : list)
                afterDividingList.add(number / divider);
            return afterDividingList;
        };
    }
}
