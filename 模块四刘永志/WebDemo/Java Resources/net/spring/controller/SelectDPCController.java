package net.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import common.Dis_publish_course_list;
import common.Dis_remark_list;
import mysql.Select_dis_publish_course;
import mysql.Select_dis_remark;

@Controller
public class SelectDPCController {
	@RequestMapping(value = "/selectDPC",method = RequestMethod.GET)
	public ModelAndView disUser() {
		
		
		Dis_publish_course_list dis_publish = new Dis_publish_course_list();
//		dis_remark.clear();
		Select_dis_publish_course sdpc = new Select_dis_publish_course();
		dis_publish = sdpc.select_dis_publish_course();
		
		
		StringBuffer list = new StringBuffer();
//		list.setLength(0);
		
		for(int i=0;i<dis_publish.getLength();i++)
		{
//			System.out.println(i);
			list.append(dis_publish.showList(i));
			list.append("<br/>");
		}
		
	
//		String me = list.toString();
		
		//ModelAndView： 包含了试图要实现的模型数据和逻辑视图名
		//message 为数据的名称，在视图中用来引用的名字
		//me 是对应的值
		//hello 是对应视图的名字
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", list);
		modelAndView.setViewName("selectDPC");
		
		return modelAndView;
		//以上4个语句相当于一下一句：
		//return new ModelAndView("dis","message",me);
		
	}
	
}
