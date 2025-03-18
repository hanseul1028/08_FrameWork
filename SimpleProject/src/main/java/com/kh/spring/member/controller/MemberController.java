package com.kh.spring.member.controller;

// import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring.member.model.dto.MemberDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MemberController {
	
	// 로그인 구현하려고 왔음
	// 서블릿 말고 컨트롤러 하위의 메소드
	
	/*
	@RequestMapping(value="login")
	public String login(HttpServletRequest request) {
		// System.out.println("로그인 요청 오면 출동 ");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		// System.out.println("id : " + id + ", pw : " + pw);
		log.info("id : {}, pw : {}", id, pw);
		return "main_page";
	}
	*/
	
	/*
	@RequestMapping("login")
	public String login(@RequestParam(value="id", defaultValue="abcde")String id, 
						@RequestParam(value="pw") String pw) {
		
		log.info("id : {}, pw : {}", id, pw);
		return "main_page";
	}
	*/
	
	
	/*
	// 전제조건 : 앞단에서 넘어오는 key값이랑 뭐가 일치해야 함 
	@PostMapping("login")
	public String login(String id, String pw) {
		
		log.info("id : {}, pw : {}", id, pw);
		
		MemberDTO member = new MemberDTO();
		member.setMemberId(id);
		member.setMemberPw(pw);
		
		return "main_page";
	}
	*/
	
	/*
	 * 커맨드 객체 방식
	 * 
	 * 1. 매개변수 자료형에 반드시 기본생성자가 존재할 것
	 * 2. 전달되는 키값과 객체의 필드명이 동일할 것
	 * 3. setter 메서드가 반드시 존재할 것
	 * 
	 * 스프링에서 해당 객체를 기본생성자를 통해서 생성한 후
	 * 내부적으로 setter 메서드를 찾아서 요청 시 전달값을 해당 필드에 대입해줌 
	 * (Setter Injection)
	 */
	@PostMapping("login")
	public String login(MemberDTO member) {
		
		log.info("header에서 변수명 맞춰주면 됨 {}", member);
		
		return "main_page";
	}
	
}











