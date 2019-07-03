package common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Dis_remark_list {

	private List<Dis_remark> disremarkList = new ArrayList<Dis_remark>();
	private int length = 0;
	

	public boolean addDiseamark(Dis_remark dis)
	{
		disremarkList.add(dis);
		
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
		
		String uid = disremarkList.get(i).getUid();
		String reason = disremarkList.get(i).getDr_reason();
		String time = disremarkList.get(i).getDr_time();
		
		list = uid+","+reason+","+time;
		
		return list;
		
	}

//	public void clear() {
//		// TODO Auto-generated method stub
//		
//			disremarkList = null;
//		
//	}
//	
	
}
