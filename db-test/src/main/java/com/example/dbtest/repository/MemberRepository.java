package com.example.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dbtest.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
