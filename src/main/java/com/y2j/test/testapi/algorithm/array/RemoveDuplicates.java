package com.y2j.test.testapi.algorithm.array;

import java.util.Arrays;

/**
 * @Author liuhao
 * @Date 2018/7/9 9:59
 */
public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        int[] params = {1,1};
        int total = removeDuplicates(params);
        System.out.println("total=" + total + ",params=" + Arrays.toString(params));
    }

    public static int removeDuplicates(int[] nums)
    {
        int total = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums.length == 1)
            {
                return 1;
            }
            if(i == nums.length - 1)
            {
                nums[total] = nums[i];
                total++;
            }
            else if(nums[i] != nums[i+1])
            {
                nums[total] = nums[i];
                total++;
            }
        }
        return total;
    }
}
