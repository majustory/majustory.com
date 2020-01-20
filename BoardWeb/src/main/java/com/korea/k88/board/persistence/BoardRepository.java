package com.korea.k88.board.persistence;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import com.korea.k88.board.domain.Board900;

public interface BoardRepository extends CrudRepository<Board900, Long>, QuerydslPredicateExecutor<Board900> {

	@Query("SELECT b  FROM  Board900  b")
	Page<Board900>  getBoardList(Pageable  pageable);
	
}
