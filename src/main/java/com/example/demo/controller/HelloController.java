package com.example.demo.controller;

import com.example.demo.Bean.BonjourBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/bonjour")
    public String hello(){return "bonjour";}
    @Autowired
    BonjourBean bonjourBean;
    @GetMapping("/BonjourBean")
    public String bonjourIoc(){ return bonjourBean.sayBonjour();}


}
