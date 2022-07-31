package com.greatlearning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter question number to run (1 or 2): ");
        int quesNum = sc.nextInt();
        switch (quesNum) {
            case 1 -> {
                Solution1 sol1 = new Solution1();
                sol1.run();
            }
            case 2 -> Solution2.run();
        }
    }
}