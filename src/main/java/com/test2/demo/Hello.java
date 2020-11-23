//package com.test2.demo;
//
////import com.test2.demo.union;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@RestController  //@RestController标签是由两个标签组成，表明我们这个类是一个controller
//// 一个是@Controller  表示该类是一个controller 能够用来接收前台发送过来的请求 去做相应的数据处理、请求的响应
////两外一个标签是@ResponseBody  将我们的数据、内容或对象作为http响应正文返回
////@ComponentScan(basePackages={"com.test2.demo.dao.TestDao"})
//public class Hello {
//    public static void main(String[] args) {
//        SpringApplication.run(Hello.class, args);
//    }
//    @RequestMapping(value = "getUser",method = RequestMethod.GET)
//    public Map<String, Object> getUser(){
//        System.out.println("微信小程序正在调用。。。");
//        Map<String, Object> map = new HashMap<String, Object>();
//        List<union> list = new ArrayList<union>();
//        union a=new union("nihao","nihaogejer");
//        list.add(a);
//        map.put("list",list);
//        System.out.println("微信小程序调用完成。。。");
//        return map;
//    }
//}
//class union{
//    public String   a;
//    public String  b;
//    union(String d,String f){
//        this.a=d;this.b=f;
//    }
//}
