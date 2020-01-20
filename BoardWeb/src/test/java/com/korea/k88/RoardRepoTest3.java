package com.korea.k88;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.korea.k88.board.domain.Board900;
import com.korea.k88.board.domain.Member900;
import com.korea.k88.board.persistence.BoardRepository;
import com.korea.k88.board.persistence.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoardRepoTest3 {
	
	@Autowired
	private MemberRepository  memberRepo;
	
	
	@Test
	public void  testgetBoardList() {
		Member900	member = memberRepo.findById("member").get();
	    System.out.println("글쓴이:" + member.getName());
	    
	    for(Board900  board : member.getBoardList()) {
	    	System.out.println(board.toString());
	    }
		
	}
}
