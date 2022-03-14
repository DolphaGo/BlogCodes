package com.example.dbtest.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dbtest.dto.MemberDto;
import com.example.dbtest.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public void put(MemberDto memberDto) throws SQLException {
        memberRepository.save(memberDto.toEntity());
        throw new SQLException(); // chcekedException
    }
}
