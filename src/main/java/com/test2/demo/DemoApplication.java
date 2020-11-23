
package com.test2.demo;

import com.test2.demo.dao.TestDao;
import com.test2.demo.entity.Test1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@RestController  //@RestController标签是由两个标签组成，表明我们这个类是一个controller
//// 一个是@Controller  表示该类是一个controller 能够用来接收前台发送过来的请求 去做相应的数据处理、请求的响应
////两外一个标签是@ResponseBody  将我们的数据、内容或对象作为http响应正文返回
@SpringBootApplication
//@MapperScan(value="com.test2.demo.dao")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
