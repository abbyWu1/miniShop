package shop.register.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Authror chenfk
 * @Date 2020-7-30 16:49
 */
@Controller
public class FirstController {

    @RequestMapping(path = "/get")
    public String get(){
        return "login";
    }
}
