package com.company;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {99,45,33,30,27,25,19,17,10,0,-9,-87};
        int target = 17;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

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
