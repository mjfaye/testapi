package com.y2j.test.testapi.algorithm.array;

import java.util.Arrays;

/**
 * @Author liuhao
 * @Date 2018/7/9 13:36
 */
public class Rotate
{
    public static void main(String[] args)
    {
        int[] a = {1,2};
        int k = 3;
        rotate(a,k);
        System.out.println(Arrays.toString(a));
    }

    public static void rotate(int[] nums, int k)
    {
        int length = nums.length;
        int[] temp = Arrays.copyOf(nums,length);
        for (int i = 0; i < nums.length; i++)
        {
            if(length == 1)
            {
                return;
            }
            if(i + k < length)
            {
                nums[i + k] = temp[i];
            }
            else
            {
                nums[(i + k) % length] = temp[i];
            }
            System.out.println(Arrays.toString(nums));
        }
    }




}
