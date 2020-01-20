package com.korea.k88.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.korea.k88.board.domain.Board900;
import com.korea.k88.board.domain.Search;
import com.korea.k88.board.security.SecurityUser;
import com.korea.k88.board.service.BoardService;

@Controller
@RequestMapping("/board/")
public class BoardController {
   @Autowired 
   BoardService    boardService;
   
	@RequestMapping("/getBoardList")
	public  String  getBoardList(Model  model,  Search search  ){
	
		if (search.getSearchCondition() == null) {
	    	search.setSearchCondition("TITLE");
	    }
	    if (search.getSearchKeyword() ==null) {
	    	search.setSearchKeyword("");
	    }
		
		Page<Board900>	boardList=boardService.getBoardList(search);
		model.addAttribute("boardList", boardList);
		return "board/getBoardList";
		
	}
	
	@RequestMapping("/getBoard")
	public  String  getBoard(Model  model,  Board900  board) {
	Board900	boardli=boardService.getBoard(board);
		model.addAttribute("boardli", boardli);
		return "board/getBoard";
		
	}
	
	@RequestMapping("/insertBoard")
	public  String  insertBoardView() {
		return "board/insertBoard";
	}
	
	@PostMapping("/insertBoard")
	public  String  insertBoard(Board900  board, @AuthenticationPrincipal SecurityUser  principal) {
		//  로그인 처리 이후에 insert 처리를 하고 있다.!!
		board.setMember900(principal.getMember900());
		boardService.insertBoard(board);
		return "redirect:getBoardList";
	}
	
	@RequestMapping("/updateBoard")
	public  String  updateBoard(Board900  board) {
		boardService.updateBoard(board);
		return "redirect:getBoardList";
	}
	
	@RequestMapping("/deleteBoard")
	public  String  deleteBoard(Board900  board) {
		boardService.deleteBoard(board);
		return "redirect:getBoardList";
	}
	
}
