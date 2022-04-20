package com.company;

public class SearchInMountainarray {
    public static void main(String[] args) {
        int[] ar={0,1,3,5,9,22,19,17,15,12,10,8,2,-1};
        int target=17;
        int index=search(ar,target);
        System.out.println(index);
    }
    static int search(int[] arr, int target) {
        int peak = indexofPeak(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }
    static int indexofPeak(int[] ar){
        int start=0;
        int end=ar.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(ar[mid]>ar[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }

        return start;
    }
    static int orderAgnosticBS(int[] arr, int target,int start,int end){


        //return -1 if the target element is not found
        while (start <= end) {
            int mid=start+(end-start)/2;
            boolean Asc=arr[start]<arr[end];
            if(arr[mid]==target){
                return mid;
            }
            if(Asc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else if(target<arr[mid]){
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}
