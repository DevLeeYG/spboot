package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/put-api")
@RestController
public class PutController {

    @PutMapping("/member")
    public ResponseEntity<MemberDto> putMemberDto3(@RequestBody MemberDto memberDto){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDto);
    }

}
