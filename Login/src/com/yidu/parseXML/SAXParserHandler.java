package com.yidu.parseXML;
import com.yidu.User;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class SAXParserHandler extends DefaultHandler {

    int userIndex = 0;
    String value = null;
    User user = null;


    private ArrayList<User> userList= new ArrayList<User>();

    public ArrayList<User> getUserList() {
        return userList;
    }
    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    @Override
    /**
     * 用来标识解析开始
     */
    public void startDocument() throws SAXException {
        super.startDocument();
//        System.out.println("SAX解析开始");
    }

    @Override
    /**
     * 用来标识解析结束
     */
    public void endDocument() throws SAXException {
        super.endDocument();
//        System.out.println("SAX解析结束");
    }
    @Override
    /**
     * 用来解析xml元素
     */
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {

        super.startElement(uri, localName, qName, attributes);

        if(qName.equals("user")){
            userIndex++;
            user = new User();
            int attrNum = attributes.getLength();
            for( int i = 0; i < attrNum; i ++){
                user.setId(attributes.getValue(i));
            }
        }
        else if (!qName.equals("user") && !qName.equals("registor")){
//            System.out.print("节点名是："+qName);

        }
    }

    @Override
    /**
     * 用来遍历Xml文件的结束标签
     */
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        //使用defaltHandler类的endElemet方法
        super.endElement(uri, localName, qName);
        //判断是否针对一个用户已经遍历结束
        if(qName.equals("user")){
            userList.add(user);
            user = new User();
        }

        else if (qName.equals("userId")){
            user.setUserId(value);
        }
        else if (qName.equals("userName")){
            user.setUserName(value);
        }
        else if (qName.equals("email")){
            user.setEmail(value);
        }
        else if (qName.equals("password")){
            user.setPassword(value);
        }
    }

    @Override
    //characters实际是整个文档的文本
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        super.characters(ch, start, length);
        value = new String(ch,start,length);//节点值

    }
}
