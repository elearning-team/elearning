package net.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import common.Dis_remark;
import mysql.Add_dis_remark;
import mysql.Delete_dis_remark;

@Controller
public class DelDRController {

	@RequestMapping("/delDR")
	public ModelAndView getParam(HttpServletRequest request,HttpServletResponse response) 
	{
		String userID = request.getParameter("delDRUserID");

		Delete_dis_remark ddr = new Delete_dis_remark();
	    
	    ddr.Delete_disremark(userID);
	    
//	    System.out.println(userID);
//	    System.out.println(reason);
	    return null;

	}
}
