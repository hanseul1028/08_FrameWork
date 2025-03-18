package com.kh.spring.member.model.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

// @Data : lombok 이용, 전부 다 

public class MemberDTO{
	private String memberId;
	private String memberPw;
	private String memberName;
	private String email;
	private Date enrollDate;
	
	
}