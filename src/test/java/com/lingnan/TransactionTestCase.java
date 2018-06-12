package com.lingnan;

import com.lingnan.aop.Transaction;
import com.lingnan.service.IBookService;
import com.lingnan.service.impl.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Created by Administrator on 2018/6/6.
 */

@ComponentScan({"com.lingnan.service", "com.lingnan.aop"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Configuration
public class TransactionTestCase {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TransactionTestCase.class);
        IBookService bookService = context.getBean(BookServiceImpl.class);
        bookService.buyBooks();
    }
}
