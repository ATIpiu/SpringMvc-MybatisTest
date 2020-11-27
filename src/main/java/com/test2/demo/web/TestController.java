package com.test2.demo.web;

import com.test2.demo.dao.TestDao;
import com.test2.demo.entity.Test1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.print.DocFlavor;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController{
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public Map<String, Object> getUser() {
        System.out.println("微信小程序正在调用。。。");
        Map<String, Object> map = new HashMap<String, Object>();
        ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        TestDao testDao= (TestDao) ctx.getBean("testDao");
        List<Test1> tests=testDao.queryTest();
        for(Test1 test1:tests){
            System.out.println(test1);
        }
        map.put("list",tests);
        System.out.println("微信小程序调用完成。。。");
        return map;
    }
    @RequestMapping(value = "hello1",method = RequestMethod.GET)
    public Map<String, Object> getUser2(String test_id) {
        System.out.println(test_id);
        System.out.println("微信小程序正在调用。。。");
        Map<String, Object> map = new HashMap<String, Object>();
        ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        TestDao testDao= (TestDao) ctx.getBean("testDao");

        Test1 test=testDao.queryTestById(Integer.parseInt(test_id));
        map.put("list",test);
        System.out.println("微信小程序调用完成。。。");
        return map;
    }
    @RequestMapping(value = "hello2",method = RequestMethod.GET)
    public Map<String, Object> getUser3(String name) {
        System.out.println(name);
        System.out.println("微信小程序正在调用。。。");
        Map<String, Object> map = new HashMap<String, Object>();
        ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        TestDao testDao= (TestDao) ctx.getBean("testDao");
        Test1 test=new Test1(name);
        testDao.insertTest(test);
        map.put("list",test);
        System.out.println("微信小程序调用完成。。。");
        return map;
    }
    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest req)
            throws IllegalStateException, IOException {
        // 判断文件是否为空，空则返回失败页面
        if (file.isEmpty()) {

            return "failed";
        }

        String fileName = file.getOriginalFilename();

        // 创建文件实例
        File filePath = new File("D:/ImageFile", fileName);
        // 如果文件目录不存在，创建目录
        if (!filePath.getParentFile().exists()) {
            filePath.getParentFile().mkdirs();
            System.out.println("创建目录" + filePath);
        }

        // 写入文件
        file.transferTo(filePath);
        System.out.println("upload 被调用3");

        return "success";
    }

    @RequestMapping(value = "hello11",method = RequestMethod.GET)
    public Map<String, Object> getUser1() {
        System.out.println("微信小程序正在调用。。。");
        Map<String, Object> map = new HashMap<String, Object>();
        ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        map.put("list","hello1");
        System.out.println("微信小程序调用完成。。。");
        return map;
    }
}