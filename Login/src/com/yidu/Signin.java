package com.yidu;

import com.yidu.parseXML.SAXParserHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Signin {
    private boolean logInto = false;

    public boolean getLogInto() {
        return logInto;
    }

    public boolean signIn(){
//        SAXParserHandler sph = new SAXParserHandler();

        User test = new User();//新建test对象测试登录
        Scanner read = new Scanner(System.in);
        System.out.println("-----------请输入用户名或邮箱：--------");
        test.setUserId(read.next());
        System.out.println("-----------请输入密码--------");
        test.setPassword(read.next());

        SAXParserFactory spf = SAXParserFactory.newInstance();

        try {
            SAXParser parser = spf.newSAXParser();
            SAXParserHandler handler = new SAXParserHandler();
            parser.parse("src/res/users.xml", handler);

            Iterator var5 = handler.getUserList().iterator();

            while(var5.hasNext()) {
                User user = (User) var5.next();
                //登录名可以是登录名或邮箱
                if(((user.getUserId().equals(test.getUserId()))||
                        (user.getEmail().equals(test.getUserId())))&&
                        (user.getPassword().equals(test.getPassword()))){
                    System.out.println("登录成功！");
                    logInto = true;
                    break;
                }
            }
            if (logInto == false)
                System.out.println("登录失败");

        } catch (ParserConfigurationException var6) {
            var6.printStackTrace();
        } catch (SAXException var7) {
            var7.printStackTrace();
        } catch (IOException var8) {
            var8.printStackTrace();
        }
        return logInto;
    }

}
