package com.y2j.test.testapi.algorithm.array;

import java.util.ArrayList;

/**
 * @Author liuhao
 * @Date 2018/7/9 14:35
 */
public class SingleNumber
{
    public static void main(String[] args)
    {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums)
    {
        int result = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++)
        {
            if(al.contains(i))
            {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++)
            {
                if((nums[i] ^ nums[j]) == 0)
                {
                    al.add(j);
                    break;
                }
                if(j == nums.length - 1)
                {
                    result = nums[i];
                    return result;
                }
            }
            if(i == nums.length - 1)
            {
                result = nums[i];
                return result;
            }
        }
        return result;
    }
}
