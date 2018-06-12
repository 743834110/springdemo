package com.lingnan;

import com.lingnan.entity.Book;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Administrator on 2018/6/5.
 */
public class springTestCase {

    @Test
    public void test(){
        ClassPathResource resource = new ClassPathResource("applicationContext.xml");
//        BeanFactory context = new XmlBeanFactory(resource);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = (Book) context.getBean("book");
//        System.out.println(book);
    }
}
