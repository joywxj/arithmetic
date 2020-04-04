package com.wxj.likou.date0404;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>@ClassName: Median  </p>
 * <p>@Description: 算法： 算法出两个数的中位数</p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/4/4</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
public class Median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0.00;
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        list.addAll(list1);
        list.addAll(list2);
        Collections.sort(list);
        // 求中位数,如果能除尽，则取中间的两位再、2，如果不能除尽，则取中间那个数
        int media1 = 0;
        int media2 = 0;
        if (list.size() % 2 == 0) {
            media1 = list.size() / 2 - 1;
            media2 = list.size() / 2;
            int sum = list.get(media1) + list.get(media2);
            result = (double) sum / 2;
        } else {
            media1 = list.size() / 2;
            result = list.get(media1);
        }
        return result;
    }
}
