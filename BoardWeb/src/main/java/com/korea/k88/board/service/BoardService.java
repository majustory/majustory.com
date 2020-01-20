package com.korea.k88.board.service;

import org.springframework.data.domain.Page;

import com.korea.k88.board.domain.Board900;
import com.korea.k88.board.domain.Search;

public interface BoardService   {
	
  void insertBoard(Board900  board);
  
  void updateBoard(Board900  board);
  
  void deleteBoard(Board900  board);
  
  Board900  getBoard(Board900  board) ;
  
  Page<Board900> getBoardList( Search search);
  
  
}
