package com.yidu;


import com.yidu.function.isValue;
import com.yidu.parseXML.SAXParserHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class User {

    private String Id;
    private String userId;
    private String userName;
    private String email;
    private String password;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public ArrayList<User> presentUser(){
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParserHandler handler = null;
        try{
            SAXParser parser = factory.newSAXParser();
            handler = new SAXParserHandler();
            parser.parse("src/res/users.xml",handler);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return handler.getUserList();
    }

    public boolean matchUser(){
        boolean findUserId = false;
        boolean matchPassword = false;
        int userNumber = 0;
        ArrayList<User> userList= presentUser();

        Scanner read = new Scanner(System.in);
        User user = new User();

        do {
            System.out.println("-----请输入用户名或邮箱：-----");
            user.setUserId(read.next());
            for (int i = 0; i < userList.size();i++){
                if (user.getUserId().equals(userList.get(i).getUserId()) ||
                        user.getUserId().equals(userList.get(i).getEmail())) {
                    findUserId = true;
                    userNumber = i;
                }
            }
            if (!findUserId) {
                System.out.println("未发现该用户名/邮箱,请检查输入!");
            }
        }while (!findUserId);

        do {
            System.out.println("-----------请输入密码：--------");
            user.setPassword(read.next());

            if (user.getPassword().equals(userList.get(userNumber).getPassword())) {
                System.out.println("登录成功！");
                matchPassword = true;
            }
            else {
                System.out.println("-----------密码错误！--------");
            }

        }while (!matchPassword) ;

        return findUserId && matchPassword;
    }

    public void userInfo(){
        boolean findUser = false;
        ArrayList<User> userList= presentUser();
        Scanner read = new Scanner(System.in);

       do{
           System.out.println("请输入您的登录名/邮箱");
            String userInput = read.next();//用户输入信息邮箱或登录名
            for (int i = 0; i < userList.size(); i++) {
                if(userInput.equals(userList.get(i).getEmail()) ||
                        userInput.equals(userList.get(i).getUserId())){
                    System.out.println("----ID："+userList.get(i).getId()+"----");
                    System.out.println("----昵称："+userList.get(i).getUserName()+"----");
                    System.out.println("----登录名："+userList.get(i).getUserId()+"----");
                    System.out.println("----邮箱："+userList.get(i).getEmail()+"----");
                    System.out.println("----密码："+userList.get(i).getPassword()+"----");
                    findUser = true;
                }
            }
            if (findUser)
                System.out.println("----查询成功！----");
            else
                System.out.println("----查询失败！请重新查询----");

        } while(!findUser);
    }

}
