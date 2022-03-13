package com.company;

public class Main {

    public static void main(String[] args) {
        int [] ar={1,10,14,21,24,50,-98,69,247};
        int target=69;

        System.out.println("The index of the given number is:");
        System.out.println(lsrch(ar,target));


    }
    static int lsrch(int[] arr,int num){

        if(arr.length==0){
            return -1;

        }
        for (int index = 0; index <arr.length ; index++) {
            if(arr[index]==num){
                return index;


            }

        }
        return -1;

    }
}
