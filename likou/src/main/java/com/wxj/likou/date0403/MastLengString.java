package com.wxj.likou.date0403;

/**
 * <p>@ClassName: MastLengString  </p>
 * <p>@Description: 最长子串 </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/4/3</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
public class MastLengString {
    /**
     * <p>@Description: 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度</p>
     * <p> * @param str </p>
     * <p>@return: int</p>
     * <p>@date:2020/4/3 16:28</p>
     */
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.equals("")) {
            return 0;
        }
        String[] split = s.split("");
        int result = 0;
        for (int i = 0; i < split.length ; i++) {
            int max = 0;
            StringBuffer sb = new StringBuffer("");
            for (int j = i; j < split.length ; j++) {
                String str = split[j];
                if(str != null && !sb.toString().contains(str)) {
                    sb.append(str);
                    if (sb.toString().length() > max) {
                        max = sb.toString().length();
                    }
                } else {
                    sb = new StringBuffer("");
                }
            }
            if(result < max){
                result = max;
            }
        }
        return result;
    }
}
