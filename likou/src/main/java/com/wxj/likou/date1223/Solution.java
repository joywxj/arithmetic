package com.wxj.likou.date1223;

/**
 * <p>@ClassName: Solution  </p>
 * <p>@Description: </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/12/23</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
public class Solution {
	public int[] runningSum(int[] nums) {

		int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = 0; j < i + 1; j++) {
				sum = sum + nums[j];
			}
			result[i] = sum;
		}
		return result;
	}
}
