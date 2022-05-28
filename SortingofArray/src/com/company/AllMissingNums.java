package com.company;

import java.util.*;

public class AllMissingNums {
    public static void main(String[] args) {
        int[] arr={12,10,5,4,7,6,2,9,1,8};

    }
    static List<Integer> findDisappearedNumbers(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i] -1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int index = 0; index< nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
