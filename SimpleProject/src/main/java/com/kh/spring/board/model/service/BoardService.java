package com.kh.spring.board.model.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import com.kh.spring.board.model.dto.BoardDTO;

public interface BoardService {
	
	// 게시글 작성 (파일 첨부) 
	void insertBoard(BoardDTO board, MultipartFile file, HttpSession session);

	// 게시글 목록 조회
	List<BoardDTO> selectBoardList(int currentPage);
	
	// 게시글 상세보기 (댓글도 같이 조회) -- 새로운거 할거임 
	BoardDTO selectBoard(int boardNo);
	
	
	// 게시글 수정
	BoardDTO updateBoard(BoardDTO board, MultipartFile file);
	
	// 게시글 삭제 (delete아니고 update임 STATS컬럼 값 N으로 바꿀 것 ) 
	void deleteBoard(int boardNo);

	// -----------

	// 게시글 검색 
	
	// 댓글 작성 
}

















