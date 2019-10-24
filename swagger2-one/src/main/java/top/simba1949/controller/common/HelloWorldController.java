package top.simba1949.controller.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Theodore
 * @Date 2019/10/23 18:14
 */
@RestController
@RequestMapping("hello")
public class HelloWorldController {

    @GetMapping
    public String sayHello(){
        return "Hello World";
    }
}
