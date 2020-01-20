package com.korea.k88;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GradleController {
	
	@RequestMapping("/hello.do")
    public  String  hello()  { 
		return "hello";
	};
}
