package com.company;

public class BubbleSort {

    public static void Sort (int[] lst) {
        int n = lst.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n-1; i ++) {
                if (lst[i] > lst[i+1]) {
                    int bigger = lst[i];
                    lst[i] = lst[i+1];
                    lst[i+1] = bigger;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
