package com.company;

import java.util.*;


public class splitArray {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(5);
        int[] arr={1,2,3,4,5,6,7,10};
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the index from which the array should be split:");
        int s=in.nextInt();
        int len =arr.length;
        for (int i = s; i < len; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i <s ; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < list.size() ; i++) {
            arr[i]=list.get(i);
        }
        System.out.println(Arrays.toString(arr));


    }
}
