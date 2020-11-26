package com.mall.order.test;

/**
 * @author acai
 * @date 2020/10/28
 **/
public class TimeComplex {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};

        System.out.println(find(arr));

    }

    public static Integer find(int[] arr){
        int target = 3;
        int start =0,end = arr.length-1;
        while (start < end) {
            if (target > arr[(end - start) / 2]) {
                start = (end - start) / 2;
            } else if (target < arr[(end - start) / 2]) {
                end = (end - start) / 2;
            }
            return (end-start)/2;
        }
        return null;
    }
}
