package common;

import java.util.ArrayList;
import java.util.List;

public class SensitiveFilter {
	
	private static List<String> filterWordList = new ArrayList<String>();
	private static int length = 0;
	
	
	public void init()
	{
		filterWordList.add("政府"); length++;
		filterWordList.add("共产党"); length++;
		filterWordList.add("卖片"); length++;
		filterWordList.add("开挂"); length++;
		filterWordList.add("傻逼"); length++;
	}
	
	public String filterword(String remark)
	{
		for(;length>0;length--)
		{
			String string = filterWordList.get(length-1);
			int workLength = string.length();
			switch (workLength)
			{
			case 1 :
				remark = remark.replace(string,"*");
				break;
			case 2 :
				remark = remark.replace(string,"**");
				break;
			case 3 :
				remark = remark.replace(string,"***");
				break;
			}
 
			
		}
		
		//加入数据库，待补充
		
		return remark;
	}
	
	public boolean addFilterWord(String s)
	{
		filterWordList.add(s);
		
		length++;
		return true;
	}

 
}
