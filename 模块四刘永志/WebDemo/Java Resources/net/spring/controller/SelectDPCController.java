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
		
		//ModelAndView�� ��������ͼҪʵ�ֵ�ģ�����ݺ��߼���ͼ��
		//message Ϊ���ݵ����ƣ�����ͼ���������õ�����
		//me �Ƕ�Ӧ��ֵ
		//hello �Ƕ�Ӧ��ͼ������
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", list);
		modelAndView.setViewName("selectDPC");
		
		return modelAndView;
		//����4������൱��һ��һ�䣺
		//return new ModelAndView("dis","message",me);
		
	}
	
}
