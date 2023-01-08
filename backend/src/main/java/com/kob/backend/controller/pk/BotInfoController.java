package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController // similar to REST, different with frontend and backend together
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
//    public String getBotInfo(){
//        return "hhhhh";
//    }
    public Map<String, String> getBotInfo(){
        Map<String, String> bot1 = new HashMap<>();
        bot1.put("name", "tiger");
        bot1.put("rating", "1400");
        return bot1;
    }
}
