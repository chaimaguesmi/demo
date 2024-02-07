package com.example.demo.controller;

import com.example.demo.Bean.HelloBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloControllerSayHello {
    @Autowired // lehna ya container a3mel instanciation w injectih min 8ir il @component m3ach te5dem
    HelloBean helloBean;
    @GetMapping("/helloBean")
    public String helloIoc(){ return helloBean.sayHello();

    }
}
