package com.company;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        int x=6;
        int[] ans=twoSum(arr,x);
        System.out.println(Arrays.toString(ans));

    }
    static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int b=target-nums[i];
            if(a+b==target && a!=b){
                int c=index(nums,a);
                int d=index(nums,b);
                return new int[]{c,d};
            }
        }
        return new int[]{-1,-1};
    }
    static int index(int[] arr, int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }

        }
        return -1;
    }
}
