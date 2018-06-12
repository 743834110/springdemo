package com.lingnan.service.impl;

import com.lingnan.service.IBookService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/6/6.
 */
@Service
public class BookServiceImpl implements IBookService{


    public void buyBooks(){
        System.out.println("买书......");
    }

}
