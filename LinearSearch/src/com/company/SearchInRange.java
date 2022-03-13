package com.company;



public class SearchInRange {
    public static void main(String[] args) {
        int [] ar={1,10,14,21,24,50,-98,69,247};
        int target=21;


        System.out.println(lsearch(ar,target,1,4));
    }
    static int lsearch(int[] arr,int num,int start, int end ){

        if(arr.length==0){
            return -1;
        }
        for (int index = start; index <=end ; index++) {
            if(arr[index]==num){
                return index;
            }
        }
        return -1;
    }

    }

