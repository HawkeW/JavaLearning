package com.yidu;

public class TestMain {


    public static void main (String[]args){

        Signup su = new Signup();
        su.Signup();

        System.out.println("==========请登录：==========");

        boolean state = false;//登录状态


        while (!state) {
            Signin si = new Signin();
            si.signIn();
            state = si.getLogInto();
        }
    }


}
