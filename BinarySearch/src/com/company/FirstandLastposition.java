package com.company;

public class FirstandLastposition {
    public static void main(String[] args) {

    }
    static int[] SearchinRange(int[] ar, int target) {
        int[] ans={-1,-1};
        int start=search(ar,target,true);
        int end=search(ar,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[] ar,int target,boolean startposition){
        int ans=-1;
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
                ans=mid;
                if(startposition){
                    end=mid-1;
                }
                else{
                    start=end+1;
                }
            }
        }
        return ans;
    }
}
