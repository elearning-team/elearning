package net.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import common.Dis_publish_course;
import common.Dis_remark;
import mysql.Add_dis_publish_course;
import mysql.Add_dis_remark;

@Controller
public class AddDPCController {

	@RequestMapping("/addDPC")
	public ModelAndView getParam(HttpServletRequest request,HttpServletResponse response) 
	{
		String userID = request.getParameter("addDPCUserID");
	    String reason = request.getParameter("addDPCreason");

	    Dis_publish_course dis = new Dis_publish_course();
	    dis.setUid(userID);
	    dis.setDpc_reason(reason);
	    
	    Add_dis_publish_course adpc = new Add_dis_publish_course();
	    adpc.add_dis_publish_course(dis);
	    
	    System.out.println(userID);
	    System.out.println(reason);
	    return null;
	}
}
