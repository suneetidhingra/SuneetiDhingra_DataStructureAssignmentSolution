package com.greatlearning;

import javax.sound.midi.SysexMessage;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution1 {

    private int expectedSize;
    private final LinkedList<Integer> orderedSizeList = new LinkedList<>();

    public void run() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no of floors in the building: ");
        int numFloors = sc.nextInt();
        expectedSize = numFloors;
        String[] result = new String[numFloors];
        for (int i = 0; i < numFloors; ++i) {
            System.out.printf("Enter the floor size given on day : %d\n", i+1);
            int size = sc.nextInt();
            result[i] = findAssembledToday(size);
        }

        System.out.println("\nThe order of construction is as follows");
        for (int i = 0; i < numFloors; ++i) {
            System.out.printf("\nDay: %d\n%s", i+1, result[i]);
        }
    }

    private String findAssembledToday(int size) {
        if (orderedSizeList.isEmpty()) {
            orderedSizeList.add(size);
        } else {
            Iterator<Integer> itr = orderedSizeList.iterator();
            int i = 0;
            while(itr.hasNext()){
                Integer currSize = itr.next();
                if (currSize < size) {
                    orderedSizeList.add(i, size);
                    break;
                }
                ++i;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!orderedSizeList.isEmpty() && orderedSizeList.getFirst() == expectedSize) {
            sb.append(expectedSize--);
            if (expectedSize != 0) {
                sb.append(" ");
            }
            orderedSizeList.removeFirst();
        }
        return sb.toString();
    }
}
