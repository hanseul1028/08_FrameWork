package com.kh.spring.member.model.service;

import com.kh.spring.member.model.dto.MemberDTO;

public interface MemberService {

	// 로그인
	MemberDTO login(MemberDTO member);
	
	// 회원가입
	// 좋은 방법 : 가입된 회원의 정보를 반환해준다 (Hibernate)
	// 일반 방법 : 정수값을 반환하거나 값을 반환하지 않는다 (MyBatis) 
	MemberDTO signUp(MemberDTO member);
	
	// 회원정보 수정
	// 전제 조건 : 로그인 되어 있을 것 
	// 로그인 된 사용자의 정보는 session에 있음 
	// int update(MemberDTO member);
	MemberDTO update(MemberDTO member);
	
	// 회원 탈퇴
	int delete(MemberDTO member);
	
	// 아이디 중복 체크
	
	// 이메일 인증 
}











