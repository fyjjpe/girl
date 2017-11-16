package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yuanjie.fang on 2017/11/15.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = {"/say"}, method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myId) {
        return "id: " + myId;
//        return girlProperties.getCupSize();
    }
}
