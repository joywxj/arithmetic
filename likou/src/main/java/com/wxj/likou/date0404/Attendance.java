package com.wxj.likou.date0404;

/**
 * <p>@ClassName: Stock  </p>
 * <p>@Description: 出勤记录</p>
 * <p>@author: wxj  </p>
 * <p>@date: 2020/4/4</p>
 * <p>@Tel:18772118541</p>
 * <p>@email:18772118541@163.com</p>
 */
public class Attendance {
    public static boolean checkRecord(String s) {
        String[] split = s.split("");
        int a = 0;
        int l = 0;
        for (String str: split) {
            if (str.equals("A")) {
                a++;
            }

            if (str.equals("L")) {
                l++;
            }
        }

        if (a <= 1 && l <= 2) { 
            return true;
        }
        return false;
    }
}
