package com.test2.demo;

import com.test2.demo.dao.TestDao;
import com.test2.demo.entity.Test1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.text.TabExpander;
import java.util.List;

public class MyTest1 {
    @Test
    public void test01(){
        String config="ApplicationContext.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);
        TestDao testDao= (TestDao) ctx.getBean("testDao");
        List<Test1> tests=testDao.queryTest();
        for (Test1 test1:tests) {
            System.out.println(test1.getTest_name());
//        String names[]=ctx.getBeanDefinitionNames();
//        for(String na:names){
//            System.out.printf("容器中对象名称："+na+'|'+ctx.getBean(na).getClass().getName());
//        }
        }
    }
}
