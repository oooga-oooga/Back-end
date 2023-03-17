package com.diary.domain.member.repository;

import com.diary.domain.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long>, MemberRepositoryCustom {
}
