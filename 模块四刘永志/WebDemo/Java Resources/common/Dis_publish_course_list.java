package common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Dis_publish_course_list {
	private List<Dis_publish_course> disPublishList = new ArrayList<Dis_publish_course>();
	private int length = 0;
	

	public boolean addDispublish(Dis_publish_course dis)
	{
		disPublishList.add(dis);
		
		length++;
		return true;
	}
	
	public int getLength()
	{
		return length;
	}

	public String showList(int i)
	{
		String list = "";
		
		String uid = disPublishList.get(i).getUid();
		String reason = disPublishList.get(i).getDpc_reason();
		String time = disPublishList.get(i).getDpc_time();
		
		list = uid+","+reason+","+time;
		
		return list;
		
	}
}
