package cn.zhc.src.controller;


import cn.zhc.src.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

/**
 * @author Cent.Chen
 * @Description
 * @date 2019/8/2 10:16 AM
 */
@RestController
public class HelloController {
   @Autowired
    HelloService helloService;


    /**
     * 示例方法
     *
     * @return
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHello(@RequestParam String name) {
        return helloService.hiService(name);

    }


}
