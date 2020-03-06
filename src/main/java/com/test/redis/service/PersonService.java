package com.test.redis.service;


import com.baomidou.mybatisplus.service.IService;
import com.test.redis.model.Person;

/**
 * All rights Reserved, Designed By www.maihaoche.com
 *
 * @Package com.test.redis.service
 * @author: angtai（angtai@maihaoche.com）
 * @date: 2019/7/5 3:41 PM
 * @Copyright: 2017-2020 www.maihaoche.com Inc. All rights reserved.
 */

public interface PersonService extends IService<Person> {

    /**
     * 新增一条数据
     */
    void add(Person person);

}