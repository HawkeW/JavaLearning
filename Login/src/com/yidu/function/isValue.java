package com.yidu.function;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isValue {

    public boolean isPassword(String str) {
        //验证含特殊字符的强密码正则表达式
        String pattern = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,16}$";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        boolean isRight = m.matches();

        if (str.length() <= 6) {
            System.out.println("密码长度过短，请重新输入");
        }
        else if (!isRight) {
            System.out.println("密码需包含大小写字母+数字，请重新输入");
        }
        return isRight;

    }
    public boolean isEmail(String email) {
        // 验证邮箱的正则表达式
        String format = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        if (email.matches(format))
        {
            return true;// 邮箱名合法，返回true
        }
        else
        {
            return false;// 邮箱名不合法，返回false
        }
    }
}
