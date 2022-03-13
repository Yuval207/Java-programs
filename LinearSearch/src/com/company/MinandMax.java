package com.company;

public class MinandMax {
    public static void main(String[] args) {
        int arr[]={1,54,123,54,-8,78,555,0,12,-7};
        System.out.println("The minimum value of the array is:");
        System.out.println(min(arr));
        System.out.println("The maximum value of the array is:");
        System.out.println(max(arr));

    }
    static int min(int[]ar){
        int ans=Integer.MAX_VALUE;
        for (int i = 0; i <ar.length; i++) {
            if(ar[i]<ans){
                ans=ar[i];
            }

        }
        return ans;
    }
    static int max(int ar[]){
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i <ar.length; i++) {
            if(ar[i]>ans){
                ans=ar[i];
            }

        }
        return ans;
    }
}

