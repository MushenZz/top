package com.soeasy.top.admin.controller;

import com.soeasy.top.support.redis.RedisService;
import com.soeasy.top.support.redis.impl.RedisServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: top
 * @description: 测试控制类
 * @author: ZhengZhe
 * @create: 2019-10-11 11:19
 */
@Api(tags = "TestController",description = "测试控制类")
@RestController
@RequestMapping(value = "/test")
public class TestController {

   @Autowired
    private RedisService redisService;

    @ApiOperation("测试方法1")
    @RequestMapping(value = "/test01",method = RequestMethod.GET)
    public String test01(){
        System.out.println("访问成功!");
        redisService.set("001","存入redis的值");
        System.out.println("获取redis中存储的值");
        String s = redisService.get("001");
        System.out.println(s);
        return "访问成功~";
    }

    public void test(){

//
//            const newArray = [];
//
//                for (let i = 0; i < this.length; i++) {
//                    for (let j = i + 1; j < this.length; j++) {
//                        if (this[i] === this[j]) {
//                            j = ++i;
//                        }
//                    }
//                    newArray.push(this[i]);
//                }
//                return newArray;


    }
}
