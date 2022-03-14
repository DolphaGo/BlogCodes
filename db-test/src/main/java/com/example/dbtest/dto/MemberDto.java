package com.example.dbtest.dto;

import com.example.dbtest.entity.Member;

import lombok.Data;

@Data
public class MemberDto {
    private String name;
    private Integer age;

    public Member toEntity() {
        return new Member(null, name, age);
    }
}
