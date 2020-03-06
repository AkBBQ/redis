package com.test.redis.service.Impl;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.test.redis.dao.PersonDao;
import com.test.redis.model.Person;
import com.test.redis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.test.redis.service.Impl
 * @author: angtai（angtai@maihaoche.com）
 * @date: 2019/7/5 3:44 PM
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 */

@Service
public class PersonServiceImpl extends ServiceImpl<PersonDao,Person> implements PersonService {
    @Autowired
    private PersonDao personDao;

    @Override
    public void add(Person person) {
        personDao.insert(person);
    }
}