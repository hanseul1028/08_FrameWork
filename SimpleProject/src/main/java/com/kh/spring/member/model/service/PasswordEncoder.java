package com.kh.spring.member.model.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PasswordEncoder {
	
	// 비밀번호와 관련된 책임들을 담당하는 클래스 

	private final BCryptPasswordEncoder passwordEncoder;
	
	public String encode(String rawPassword) {
		return passwordEncoder.encode(rawPassword);
	}
	
	public boolean matches(String rawPassword, String encodedPassword) {
		return passwordEncoder.matches(rawPassword, encodedPassword);
	}

}
