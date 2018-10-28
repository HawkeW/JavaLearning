package com.yidu;

import com.yidu.parseXML.SAXParserHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Signin {
    private boolean logInto = false;
    private boolean findUserId = false;
    public boolean getLogInto() {
        return logInto;
    }

    public String signIn(){
        int userNumber = 0;
        User user = new User();//新建test对象测试登录
        while (!logInto) {
            logInto = user.matchUser();
        }
        return "";
    }

}
