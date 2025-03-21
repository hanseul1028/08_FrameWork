package com.kh.spring.board.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.kh.spring.board.model.dto.BoardDTO;
import com.kh.spring.board.model.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
// @RequestMapping("boards")
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;

	@GetMapping("boards")
	public String toBoardList() {
		return "board/board_list";
	}
	
	@GetMapping("form.bo")
	public String goToForm() {
		return "board/insert_board";
	}

	@PostMapping("boards")
	public ModelAndView newBoard(ModelAndView mv
								, BoardDTO board
								, MultipartFile upfile
								, HttpSession session) {
		
		log.info("게시글 정보 : {}, 파일 정보 : {}", board, upfile);
		
		// 첨부 파일의 존재 유무 
		// => 차이점 => MultipartFile타입의 filename필드 값으로 확인을 하겠다 
		
		// INSERT INTO TB_SPRING_BOARD(BOARD_TITLE, BOARD_CONTENT, BOARD_WRITER, CHANGE_NAME)
		// VALUES (#{boardTitle}, #{boardContent}, #{boardWriter}, #{changeName});
		
		// 1. 권한있는 요청인가
		// 2. 값들이 유효성이 있는 값인가 
		// 3. 전달된 파일이 존재할 경우 => 파일명 수정 서버에 올리고 BoardDTO의 changeName 필드에 값을 대입 
		boardService.insertBoard(board, upfile, session);
		
		return null;
	}
	
	
	

}














