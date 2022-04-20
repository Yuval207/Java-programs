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
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
