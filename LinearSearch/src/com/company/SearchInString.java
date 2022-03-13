package com.company;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String element = "Sodium";
        char alpha = 'u';
        System.out.println(stringsearch(element,alpha));
        System.out.println(Arrays.toString(element.toCharArray()));


    }
    static boolean stringsearch(String ele, char target) {
        if (ele.length() == 0) {
            return false;
        }
        for (int i = 0; i < ele.length(); i++) {
            if (ele.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    //Enhanced for loop for string search
    static boolean stringsearch2(String ele, char target) {
        if (ele.length() == 0) {
            return false;
        }
        for (char j:ele.toCharArray()) {
            if(j==target){
                return true;
            }

        }
        return false;

    }


}
