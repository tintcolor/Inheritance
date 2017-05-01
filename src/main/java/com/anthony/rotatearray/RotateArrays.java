package com.anthony.rotatearray;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class RotateArrays extends ArrayList {

    ArrayList<Integer> list = new ArrayList<Integer>(7);


    public static void main(String[] args) {
        new RotateArrays();
    }

    RotateArrays() {
        int listLength;
        //int listOriginalLength = list.toArray().length;
        for (int i = 0; i < 6; i++) {
            list.add(i, i + 1);
        }

        System.out.println(list);
        listLength = list.toArray().length;

        for (int i = 0, j = 3; i < listLength && j < 8; i++, j++) {
            if (j >= 7) {
                j = 1;
            }
            list.set(i, j);
        }
        System.out.println(list);
    }


}
