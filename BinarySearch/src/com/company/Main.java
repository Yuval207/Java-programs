package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {-48, -11, -5, 0, 3, 4, 6, 7, 9, 12, 15, 17, 19, 24, 36, 48};
        int target = 17;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    //return index at which element is found
    static int binarySearch(int[] ar, int target) {
        int start = 0;
        int end = ar.length -1;

        //return -1 if the target element is not found
        while (start <= end) {
            int mid=start+(end-start)/2;
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
        return -1;
    }
}
