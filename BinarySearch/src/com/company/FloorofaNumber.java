package com.company;

public class FloorofaNumber {
    public static void main(String[] args) {
        //floor of a number is the greatest number smaller than and equal to the number
        int[] arr = {-48, -11, -5, 0, 3, 4, 6, 7, 9, 12, 15, 17, 19, 24, 36, 48};
        int target = 16;
        int ans=Floor(arr,target);
        System.out.println(ans);
    }
    static int Floor(int[] ar, int target) {
        int start = 0;
        int end = ar.length -1;

        //return -1 if the target element is not found
        while (start <= end) {
            int mid=start+(end-start)/2;
            if(target>ar[ar.length-1]){
                return -1;
            }
            if(target<ar[mid]){
                end=mid-1;
            }
            else if(target>ar[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
