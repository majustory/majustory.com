package com.korea.k88.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.korea.k88.board.domain.Board900;
import com.korea.k88.board.domain.QBoard900;
import com.korea.k88.board.domain.Search;
import com.korea.k88.board.persistence.BoardRepository;
import com.querydsl.core.BooleanBuilder;

@Service
public class BoardServiceImpl implements BoardService  {
  
	 @Autowired
	 private  BoardRepository  boardRepo;
	
	
	@Override
	public void insertBoard(Board900 board) {
		boardRepo.save(board);
		
	}

	@Override
	public void updateBoard(Board900 board) {
		Board900	findBoard = boardRepo.findById(board.getSeq()).get();
		findBoard.setTitle(board.getTitle());
		findBoard.setContent(board.getContent());
		boardRepo.save(findBoard);				
	}

	@Override
	public void deleteBoard(Board900 board) {
		boardRepo.deleteById(board.getSeq());
		
	}

	@Override
	public Board900 getBoard(Board900 board) {
		// TODO Auto-generated method stub
		return  boardRepo.findById(board.getSeq()).get();
	}

	@Override
	public Page<Board900> getBoardList(Search search) {
		
		BooleanBuilder	builder =new  BooleanBuilder();	
		QBoard900 qboard=QBoard900.board900;
		if (search.getSearchCondition().equals("TITLE")) {
			builder.and(qboard.title.like("%" + search.getSearchKeyword() + "%"));
		}else if (search.getSearchCondition().equals("CONTENT")) {
			builder.and(qboard.content.like("%" + search.getSearchKeyword() + "%"));
		}
		
		
	 Pageable	pageable=PageRequest.of(0, 10,Sort.Direction.DESC,"seq");
		return boardRepo.findAll(builder, pageable);
	}

}
