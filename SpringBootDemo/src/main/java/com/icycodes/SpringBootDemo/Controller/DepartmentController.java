package com.icycodes.SpringBootDemo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class DepartmentController {

    @GetMapping("/")
    public String getString(){
        return "helloo hellossso";
    }

    @PostMapping("/post")
    public void postString(){

    }

}
