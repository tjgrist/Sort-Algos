package com.company;

import java.util.Arrays;

public class Main {

    private static int[] lst = {4,1,8,9,5,2,7,3,6,0};

    public static void main(String[] args) {
        BubbleSort.Sort(lst);
        PrintLst(lst);
        UnSort();
        MergeSort.Sort(lst);
        PrintLst(lst);
        UnSort();
    }

    private static void PrintLst (int[] lst) {
        System.out.println(Arrays.toString(lst));
    }

    private static void UnSort () {
        lst = new int[]{4,1,8,9,5,2,7,3,6,0};
    }
}