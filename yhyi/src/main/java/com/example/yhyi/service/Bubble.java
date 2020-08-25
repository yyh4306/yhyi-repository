package com.example.yhyi.service;

import com.sun.deploy.util.ArrayUtil;
import org.yaml.snakeyaml.util.ArrayUtils;

/**
 * 冒泡排序
 */
public class Bubble {
    public static void main(String[] args) {
        int[] array={5,8,2,7,5,6,3,4,8,9};
        bubbleSort(array);
        for (int i:array){
            System.out.print(i+" ****dev1 ");
        };
    }

    public static void bubbleSort(int[] array){
        for (int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
