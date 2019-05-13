package com.readfileexcel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String showUploadForm() {
		return "upload";
	}
	
	
	@RequestMapping("/upload")
	@ResponseBody
	public String upload( @RequestParam(name = "fileExcel", required = true) MultipartFile multipartFile) {
		// viet cach doc file excel vao day in ra console
		
		
		System.out.println("ten file " + multipartFile.getOriginalFilename());
		
		return "upload thanh cong";
	}
}
