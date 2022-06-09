package practice.practice;

import practice.InsertionSort;

public class Main {
    public static void main(String[] args) {
        InsertionSort sort1 = new InsertionSort();
        int[] arr = {9,1,3,2,1,0};
        sort1.sort(arr);
        for(int a: arr){
            System.out.println(a);
        }

    }
}
