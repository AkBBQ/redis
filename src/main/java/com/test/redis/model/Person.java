package com.test.redis.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Builder;
import lombok.Data;


@Data
@TableName("Person")
@Builder
public class Person {
    /**
     * ID
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 年纪
     */
    @TableField("age")
    private Integer age;
}