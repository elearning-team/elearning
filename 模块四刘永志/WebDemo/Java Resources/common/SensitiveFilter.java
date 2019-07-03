package common;

import java.util.ArrayList;
import java.util.List;

public class SensitiveFilter {
	
	private static List<String> filterWordList = new ArrayList<String>();
	private static int length = 0;
	
	
	public void init()
	{
		filterWordList.add("����"); length++;
		filterWordList.add("������"); length++;
		filterWordList.add("��Ƭ"); length++;
		filterWordList.add("����"); length++;
		filterWordList.add("ɵ��"); length++;
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
		
		//�������ݿ⣬������
		
		return remark;
	}
	
	public boolean addFilterWord(String s)
	{
		filterWordList.add(s);
		
		length++;
		return true;
	}

 
}
