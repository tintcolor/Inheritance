package com.anthony.rotatearray;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class RotateArrays extends List {

    ArrayList<Integer> list = new ArrayList<Integer>(7);

    public static void main(String[] args) {
        new RotateArrays();
    }

    RotateArrays() {

        System.out.println(rotateList(list, 2));
    }

    public ArrayList rotateList(ArrayList<Integer> list, int limitLoopToThisNumber) {

        for (int i = 0; i < 6; i++) {
            list.add(i, i + 1);
        }
        System.out.println(list);

        for (int i = 0, j = 0; i < 6 && j < limitLoopToThisNumber; i++, j++) {
            list.add(list.size(), list.get(j));
        }

        for (int i = 0, j = 0; i < limitLoopToThisNumber && j < 1; i++) {
            list.remove(j);
        }

        return list;
    }

}
