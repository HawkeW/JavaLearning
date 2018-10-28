package com.yidu;

import java.util.Scanner;

public class TestMain {


    public static void main (String[]args){

        Signup su = new Signup();
        Signin si = new Signin();
        User usr = new User();
        boolean state = true;//登录状态

        while (state) {
            System.out.println("请输入对应编号选择操作：");
            System.out.println("==========1.注册===============");
            System.out.println("==========2.登录===============");
            System.out.println("==========3.查询用户数量=======");
            System.out.println("==========4.查询用户信息=======");
            System.out.println("==========5.退出===============");

            Scanner in = new Scanner(System.in);
            String action = in.next();
            switch (action) {
                case "1":
                    su.signUp();
                    break;
                case "2":
                    si.signIn();
                    break;
                case "3":
                    System.out.println("当前共有"+usr.presentUser().size()+"个用户");
                    break;
                case "4":
                    usr.userInfo();
                    break;
                case "5":
                    state = false;
                    System.out.println("再见！欢迎再来!");
                    break;
            }

        }



    }


}
