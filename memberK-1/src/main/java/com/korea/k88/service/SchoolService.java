package com.korea.k88.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.korea.k88.mapper.SchoolDaoI;
import com.korea.k88.vo.SchoolVo;

@Service
public class SchoolService {

 @Autowired
 SchoolDaoI  schoolDaoI ;
 
 public  List<SchoolVo>  getSelectSchool(SchoolVo vo) {
  return schoolDaoI.selectSchool(vo);
  
 }


public void insertSchool(SchoolVo vo) {
	schoolDaoI.InsertSchool(vo);
	
}


public void deleteSchool(SchoolVo vo) {
	schoolDaoI.DeleteSchool(vo);
	
}


}