package com.rode.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class UserController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "fuck you!";
    }
}
