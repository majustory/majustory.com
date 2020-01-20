package com.korea.k88.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.korea.k88.vo.SchoolVo;

@Mapper
@Component
public interface SchoolDaoI {
	
    // 메소드 이름은  selectSchool() 와 InsertSchool() 는  school-Mapper.xml 의 id 값 

  public  List<SchoolVo>  selectSchool(SchoolVo vo) ;

  public void InsertSchool(SchoolVo vo) ;

  public void DeleteSchool(SchoolVo vo);

}
