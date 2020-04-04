package com.wxj.likou.date0404;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@ClassName: SmallThanSelf  </p>
 * <p>@Description: 在数组中找出比自己小的数的个数 </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/4/4</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
public class SmallThanSelf {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum  = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    sum++;
                }
            }
            result[i] = sum;
        }
        return result;
    }
}
