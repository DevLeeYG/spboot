package com.springboot.api.controller;



import com.springboot.api.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {


    @PostMapping("/member")
    public String postMember(@RequestBody Map<String,Object> data){
        StringBuilder sb = new StringBuilder();

        data.entrySet().forEach(map->{
            sb.append(map.getKey() + ": " + map.getValue());
        });
       return sb.toString();
    }

    @PostMapping("/member2")
    public String postMember2(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }




}
