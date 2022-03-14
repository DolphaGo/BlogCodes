package com.example.dbtest.controller;

import java.sql.SQLException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbtest.dto.MemberDto;
import com.example.dbtest.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/test")
    public ResponseEntity<String> test(@RequestBody MemberDto memberDto) throws SQLException {
        try {
            memberService.put(memberDto);
            return ResponseEntity.ok("성공");
        }catch (Exception e){
            log.error("Exception....", e);
            throw new SQLException();
        }
    }
}
