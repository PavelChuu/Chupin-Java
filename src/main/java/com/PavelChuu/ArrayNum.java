package com.PavelChuu;
public class ArrayNum {
    public static void main(String[] args){
        int[] nums = new int[] {1,2,3,4,5,6,7,8,9,10};

        for (int i=0; i<10; i++){
            if (nums[i] % 2 == 0)
                System.out.println(nums[i]);
        }
    }
}
