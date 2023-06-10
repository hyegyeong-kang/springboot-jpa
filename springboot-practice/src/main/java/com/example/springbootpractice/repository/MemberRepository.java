package com.example.springbootpractice.repository;

import com.example.springbootpractice.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmail(String email);

}