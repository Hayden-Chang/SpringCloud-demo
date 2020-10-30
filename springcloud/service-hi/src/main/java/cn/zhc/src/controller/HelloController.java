package cn.zhc.src.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

/**
 * @author Cent.Chen
 * @Description
 * @date 2019/8/2 10:16 AM
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Value("${server.port}")
    private String port;


    /**
     * 示例方法
     *
     * @return
     */
    @RequestMapping(value="/sayHello",method = RequestMethod.GET)
    public String sayHello(@RequestParam String name) {
        return "Hello,This is "+name+"hi-Service from port" + port;
    }


}
