package com.yidu;

import com.yidu.function.isValue;
import com.yidu.parseXML.SAXParserHandler;
import com.yidu.parseXML.WriteXML;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Signup {


    public void signUp() {
        User user1 =new User();//新注册用户
        ArrayList<User> userList = user1.presentUser();;
        Random r = new Random();
        int random = r.nextInt(100);

        isValue isvalue = new isValue();



        try {
            Scanner read = new Scanner(System.in);


            System.out.println("-----------欢迎来到Yidu.com，请按照以下步骤进行注册--------");
            System.out.println("1.请输入您的昵称：");
            user1.setUserName(read.next());//新用户昵称

            //邮箱注册，邮箱不可重复
            while(true) {
                System.out.println("2.请输入您的邮箱：");
                String email = read.next();//email局部变量
                for (int i = 0; i < userList.size(); i++) {
                    //判断邮箱格式
                    if(!isvalue.isEmail(email)){
                        System.out.println("邮箱格式错误，请检查");
                        email = null;
                        break;
                    }
                    else if (userList.get(i).getEmail().equals(email)) {
                        System.out.println("该邮箱已被注册，请重新输入");
                        email = null;
                        break;
                    }
                }
                if (email != null) {
                    System.out.println("恭喜！该邮箱可以使用");
                    user1.setEmail(email);
                    break;
                }
            }

            //登录名注册，登录名不可重复
            while(true) {
                System.out.println("3.请输入您的登录名(不可修改)：");
                String ui = read.next();//userId局部变量
                for (int i = 0; i < userList.size(); i++) {
                    if (userList.get(i).getUserId().equals(ui)) {
                        System.out.println("该登录名已被注册，请重新输入");
                        ui = null;
                        break;
                    }
                }
                if (ui != null) {
                    System.out.println("恭喜！该登录名可以使用");
                    user1.setUserId(ui);
                    break;
                }
            }

            //密码注册，必须包含大小写
            while(true) {
                System.out.println("4.请输入您的密码（不低于6位，需包含大小写字母+数字/符号等）：");
                String pw = read.next();//password局部变量

                if (!isvalue.isPassword(pw)) {
                    pw = null;
                }
                else if (pw != null) {
                    System.out.println("恭喜！您已成功注册");
                    user1.setPassword(pw);
                    break;
                }
            }

            //随机生成系统ID，可增加判断修改为添加不重复ID

            String id = String.valueOf(random);
            user1.setId(id);

            userList.add(user1); //将用户信息写入userList

        }finally {
            WriteXML write = new WriteXML();
            write.WriteXML(userList);
        }

    }


}
