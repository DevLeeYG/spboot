package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    @GetMapping("/res")
    public String getControll(){
        return "asdf";
    }
    @GetMapping("/name")
    public String getName(){
        return "lee";
    }

    @GetMapping("/{variable}")
    public String getVariable(@PathVariable String variable){
        return variable;
    }

    @GetMapping("/variable2/ {variable}")
    public String getVariable2(@PathVariable String variable){
        return variable;
    }

    @GetMapping("/variable3/{variable}")
    public String getVariable3(@PathVariable("variable") String var){
        return var;
    }

    @GetMapping("/request1")
    public String getRequestParam1(@RequestParam Map<String,String> var){
        StringBuilder sb = new StringBuilder();
        var.entrySet().forEach(map->{
           sb.append(map.getKey() + ": " + map.getValue() + "\n");
        });
        return sb.toString();

    }

    @GetMapping("/request3")
    public String getRequestParam3(MemberDto memberDto){
        return memberDto.toString();
    }

}
