package com.korea.k88.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.korea.k88.service.SchoolService;
import com.korea.k88.vo.SchoolVo;

@Controller
public class SchoolController {
	  @Autowired
	   private SchoolService schoolService;
	  
	     @RequestMapping("/school/select.do")
	     public  String  selectBoard(SchoolVo vo, Model model) throws Exception {
	    	// if (vo.getCh1() ==null) vo.setCh1("sno");
	    	// if  (vo.getCh1() ==null) vo.setCh2("");
	        model.addAttribute ("schoolList", schoolService.getSelectSchool(vo) );
	     return "member/select";
	   }
	     
		  
	   @RequestMapping("/school/form.do")
	     public  String  formdo(SchoolVo vo, Model model) throws Exception {
		 return "member/form";
	   }
	

	   @RequestMapping("/school/formOK.do")
	   public String insertBoard(SchoolVo  vo) {
	       schoolService.insertSchool(vo);
	    return "redirect:/school/select.do";
	   }
	   
	   @RequestMapping("/school/DeleteOK.do")
	   public String deleteBoard(SchoolVo  vo) {
		   System.out.println("삭제 번호 :" + vo.getSno());
	       schoolService.deleteSchool(vo);
	    return "redirect:/school/select.do";
	   }
	   	   
	
}
