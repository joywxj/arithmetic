package com.wxj.likou.date0404;

/**
 * <p>@ClassName: LeftSpin  </p>
 * <p>@Description: 左旋转字符串 </p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/4/4</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
public class LeftSpin {
    public String reverseLeftWords(String s, int n) {
        String result = "";
        if(s == null || "".equals(s) || n > s.length()) {
            return "请检查输入参数";
        }
        String start = s.substring(0, n);
        String end = s.substring(n, s.length());
        result = end + start;
        return result;
    }
}
