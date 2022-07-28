package com.company;

public class sumOfTriangle {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        System.out.println(sum(ar,0,ar[1]));
    }


    static int sum(int[] arr, int start, int end){
        if(end == arr.length-1){
            return arr[arr.length-1];
        }
        return sum(arr, start, end) +sum(arr, start+1, end+1);
    }
}
