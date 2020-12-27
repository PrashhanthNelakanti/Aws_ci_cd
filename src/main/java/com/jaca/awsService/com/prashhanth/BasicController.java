package com.jaca.awsService.com.prashhanth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/")
    public String prashhanth(){
        return "Hey Prashhanth";
    }
}
