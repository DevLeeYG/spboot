package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {
    @DeleteMapping("/member")
    public String member(@PathVariable String var){

        return var;

    }

    @DeleteMapping("/member2")
        public String member2(@RequestParam String email){
            return email;

    }
}
