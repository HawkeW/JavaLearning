package com.yidu.parseXML;

import com.yidu.Signup;
import com.yidu.User;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class WriteXML {

    //生成XML
    //1.创建一个TransformerFactory 类的对象
    SAXTransformerFactory tff = (SAXTransformerFactory) SAXTransformerFactory
            .newInstance();
    public void WriteXML(ArrayList<User> userList) {
        Signup signUp = new Signup();


        //生成XML
        //1.创建一个TransformerFactory 类的对象
        SAXTransformerFactory tff = (SAXTransformerFactory) SAXTransformerFactory
                .newInstance();

        try {
            //2.通过SAXTransformerFactory对象创建一个TransformerHandler对象
            TransformerHandler handler = tff.newTransformerHandler();
            //3.通过handler对象创建一个transformer对象、
            Transformer tr = handler.getTransformer();
            //4.通过Transformer对生成的xml文件进行设置
            //设置xml的编码和是否换行
            tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");//编码
            tr.setOutputProperty(OutputKeys.INDENT, "yes");//换行
            //5.创建一个result对象，通过其创建文件和文件输出流编写
            File f = new File("src/res/users.xml");
            if (!f.exists()) {
                if (f.createNewFile()){
                    f.createNewFile();
                }
            }
            //6.创建result对象，并使其与handler关联
            Result result = new StreamResult(new FileOutputStream(f));
            handler.setResult(result);
            //7.利用handler进行xml文件内容的编写
            //打开文档document
            handler.startDocument();
            AttributesImpl attr = new AttributesImpl();//每创建一次startElment都会使用一次attr，方便使用
            handler.startElement("", "", "registor", attr);
            //user写入Xml文件
            for (User u : userList) {
                attr.clear();
                attr.addAttribute("", "", "id", "", u.getId());
                handler.startElement("", "", "user", attr);
                //userId
                attr.clear();
                handler.startElement("", "", "userId", attr);
                handler.characters(u.getUserId().toCharArray(), 0, u.getUserId().length());
                handler.endElement("", "", "userId");
                //userName
                attr.clear();
                handler.startElement("", "", "userName", attr);
                handler.characters(u.getUserName().toCharArray(), 0, u.getUserName().length());
                handler.endElement("", "", "userName");
                //email
                attr.clear();
                handler.startElement("", "", "email", attr);
                handler.characters(u.getEmail().toCharArray(), 0, u.getEmail().length());
                handler.endElement("", "", "email");
                //password
                attr.clear();
                handler.startElement("", "", "password", attr);
                handler.characters(u.getPassword().toCharArray(), 0, u.getPassword().length());
                handler.endElement("", "", "password");
                handler.endElement("", "", "user");
            }

            handler.endElement("", "", "registor");
            //关闭document
            handler.endDocument();
            System.out.println("-----------注册成功！--------");

        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }


}
