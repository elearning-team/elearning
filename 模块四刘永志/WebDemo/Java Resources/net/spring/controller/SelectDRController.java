package net.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mysql.Select_dis_remark;
import common.*;

@Controller
public class SelectDRController {

	@RequestMapping(value = "/selectDR",method = RequestMethod.GET)
	public ModelAndView disUser() {
		
		
		Dis_remark_list dis_remark = new Dis_remark_list();
//		dis_remark.clear();
		Select_dis_remark sdr = new Select_dis_remark();
		dis_remark = sdr.select_disremark();
		
		
		StringBuffer list = new StringBuffer();
//		list.setLength(0);
		
		for(int i=0;i<dis_remark.getLength();i++)
		{
//			System.out.println(i);
			list.append(dis_remark.showList(i));
			list.append("<br/>");
		}
		
	
//		String me = list.toString();
		
		//ModelAndView�� ��������ͼҪʵ�ֵ�ģ�����ݺ��߼���ͼ��
		//message Ϊ���ݵ����ƣ�����ͼ���������õ�����
		//me �Ƕ�Ӧ��ֵ
		//hello �Ƕ�Ӧ��ͼ������
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", list);
		modelAndView.setViewName("selectDR");
		
		return modelAndView;
		//����4������൱��һ��һ�䣺
		//return new ModelAndView("dis","message",me);
		
	}
	
	
}
