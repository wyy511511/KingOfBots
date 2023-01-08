package com.kob.backend.controller.pk;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/pk/")
public class IndexController {
    //create page: resources/template/ new directory be named pk
    @RequestMapping("index/")
    public String index() {
        return "pk/index.html";
    }


}
