package com.kh.spring.board.model.service;

import java.security.InvalidParameterException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kh.spring.board.model.dto.BoardDTO;
import com.kh.spring.exception.AuthenticationException;
import com.kh.spring.member.model.dto.MemberDTO;

@Service
public class BoardServiceImpl implements BoardService {

	@Override
	public void insertBoard(BoardDTO board, MultipartFile file, HttpSession session) {
		
		// 1. 권한 체크 
		MemberDTO loginMember = (MemberDTO)session.getAttribute("loginMember");
		
		if(loginMember  != null && !loginMember.getMemberId().equals(board.getBoardWriter())) {
			throw new  AuthenticationException("권한 없는 접근입니다 ");
		}
			
		// 2. 유효성 검사 
		if(board.getBoardTitle() == null || board.getBoardTitle().trim().isEmpty() ||
		   board.getBoardContent() == null || board.getBoardContent().trim().isEmpty() ||
		   board.getBoardWriter() == null || board.getBoardWriter().trim().isEmpty()) {
			
			throw new InvalidParameterException("유효하지 않은 요청입니다 ");
		}
		   
		   
			
			
			
		}
		
		
		
		
	

	@Override
	public List<BoardDTO> selectBoardList(int currentPage) {
		return null;
	}

	@Override
	public BoardDTO selectBoard(int boardNo) {
		return null;
	}

	@Override
	public BoardDTO updateBoard(BoardDTO board, MultipartFile file) {
		return null;
	}

	@Override
	public void deleteBoard(int boardNo) {
	}

	
	
}
