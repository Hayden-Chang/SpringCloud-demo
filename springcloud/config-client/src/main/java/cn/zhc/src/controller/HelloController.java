package cn.zhc.src.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cent.Chen
 * @Description
 * @date 2019/8/2 10:16 AM
 */
@RestController
//刷新配置
@RefreshScope
public class HelloController {

    @Value("${foo}")
    private String foo;

    /**
     * 示例方法
     *
     * @return
     */
    @RequestMapping(value="/hi",method = RequestMethod.GET)
    public String sayHello(){
        return foo;
    }


}
