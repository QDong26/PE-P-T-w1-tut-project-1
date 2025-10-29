package org.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) { //the main method to indicate that this is the starting point of the program
        Integer[][] lists = {
                {70, 61, 72, 83, 38},
                {7, 2, 76, 4, 99},
                {28, 9, 13, 78, 19},
                {68, 84, 41, 62, 18},
                {37, 57, 40, 13, 50}
        };

        for (int i = 0; i < lists.length; i++) {
            Integer[] sorted = BubbleSort.sort(lists[i]);
            System.out.println("Array " + (i + 1) + ": " + Arrays.toString(sorted));
        }
    }
}
