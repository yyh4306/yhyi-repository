package com.example.yhyi.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 发现数组中重复的数字（任意一个）
 */
public class FindRepeatNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {1, 2, 3, 5, 6, 4, 11, 12, 13, 45, 46, 11};
        int repeatNumber = findRepeatNumber(nums);
        System.out.println(repeatNumber);
    }

    public static int findRepeatNumber(int[] nums) {
            /*for(int i = 0 ; i<nums.length; i++){
                for(int j=i;j<nums.length-1;j++){
                    if (nums[i]==nums[j+1]){
                        return nums[i];
                    }
                }
            }*/
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.add(nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }
}

/**
 * 在字符串中输出不同的字符（比如：'12334456'  输出：'123456'）
 */
class FindOnlyChar{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str="";
        while(true){
            str=scanner.next();
            System.out.println(findOnlyChar(str));
        }
    }

    public static String findOnlyChar(String str){
        String[] strArray=str.split("");
        HashSet<String> hashSet=new HashSet<String>();
        for (String s:strArray){
            hashSet.add(s);
        }
        StringBuffer stringBuffer=new StringBuffer();
        for (String string:hashSet){
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }
}
