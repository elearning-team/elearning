package net.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import common.Dis_remark;
import mysql.Add_dis_remark;

@Controller
public class AddDRController {

	@RequestMapping("/addDR")
	public ModelAndView getParam(HttpServletRequest request,HttpServletResponse response) 
	{
		String userID = request.getParameter("addDRUserID");
	    String reason = request.getParameter("addDRreason");

	    Dis_remark dis = new Dis_remark();
	    dis.setUid(userID);
	    dis.setDr_reason(reason);
	    
	    Add_dis_remark adr = new Add_dis_remark();
	    adr.add_disremark(dis);
	    
//	    System.out.println(userID);
//	    System.out.println(reason);
	    return null;

	}
	
}
