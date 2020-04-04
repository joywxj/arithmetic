package com.wxj.likou.util;

import com.wxj.likou.date0403.MastLengString;
import com.wxj.likou.date0404.Median;

/**
 * <p>@ClassName: MainClass  </p>
 * <p>@Description: 调用类</p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020年4月3日</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
public class MainClass {
    public static void main(String[] args) {
//        int result = MastLengString.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\");
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double result = Median.findMedianSortedArrays(nums1,nums2);
        System.out.println("结果："+result);
    }
}
