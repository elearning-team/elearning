package test;
import common.SensitiveFilter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String remark ="�ҽн�С��";
		SensitiveFilter sensitiveFilter = new SensitiveFilter();
		sensitiveFilter.init();
		sensitiveFilter.addFilterWord("��С��");
		String s = sensitiveFilter.filterword(remark);
		System.out.println(s);
		
		
		
	}

}
