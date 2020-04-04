package com.wxj.likou.date0403;
import java.util.ArrayList;
import java.util.List;
/**  
* <p>@ClassName: Solution  </p>
* <p>@Description: 力扣算法练习---两数之合 </p>
* <p>@author: wxj  </p>
* <p>@date: 2020/4/3</p>
* <p>@Tel:18772118541</p>
* <p>@email:18772118541@163.com</p>
*/
public class Solution {
    public static void main(String[] args) {
        int[] result = new int[4];
        result[0] = 2;
        result[1] = 7;
        result[2] = 11;
        result[3] = 15;
        int[] ints = twoSum(result, 9);
        for (int i:ints) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        /**
        * <p>@Description:给一个数组： 2，7，11，15，一个目标：9，需返回2，t的下标</p>
        * <p> @param nums</p>
        * <p> @param target </p>
        * <p>@return: int[]</p>
        * <p>@date:2020/4/3 16:17</p>
        */
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if(sum == target){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i< list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}
