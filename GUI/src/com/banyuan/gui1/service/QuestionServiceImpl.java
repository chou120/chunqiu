package com.banyuan.gui1.service;

import com.banyuan.gui1.dao.QuestionDao;
import com.banyuan.gui1.dao.impl.QuestionImpl;
import com.banyuan.gui1.pojo.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionServiceImpl implements QuestionService {

    private QuestionDao   questionDao =new QuestionImpl();


    @Override
    public List<Question> getQList() {

        List<Question>  list=new ArrayList<>();

        List<Question>  li=questionDao.getInfo();

        //随机生成5个题目
        for (int i = 0; i <5; i++) {
            int  index=(int)(Math.random()*(li.size()));
            list.add(li.get(index));

        }
        return list;
    }
}
