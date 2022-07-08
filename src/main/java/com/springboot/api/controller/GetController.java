package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping( "/variable1/{asdf}")
    public String getVari(@PathVariable String asdf){
        return asdf;
    }

    @GetMapping(value = "/request")
    public String getRequest( @RequestParam String name,
                              @RequestParam String email,@RequestParam String organization){

        return name + " " + email + " " + organization;

    }

    @GetMapping("/request2")
    public String getRequest2(@RequestParam Map<String,String> param){

            StringBuilder sb = new StringBuilder();

            param.entrySet().forEach((el)->{
               sb.append(el.getKey() + ":" + el.getValue() +"\n");
            });

        return sb.toString();
    }

    @GetMapping("/request3")
    public String getRequestParam3(@RequestParam Map<String,String> param){
       StringBuilder sb = new StringBuilder();

       param.entrySet().forEach((map)->{
           sb.append(map.getKey() +" :" + map.getValue() + "\n");
       });

        return sb.toString();

        };

    @GetMapping("/request4")
    public String getRequestParam3(MemberDto memberDto){
        return memberDto.getName() + " " + memberDto.getEmail() +" " + memberDto.getOrganization();
    }

    }



