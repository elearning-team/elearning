package test;
import common.SensitiveFilter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String remark ="我叫江小白";
		SensitiveFilter sensitiveFilter = new SensitiveFilter();
		sensitiveFilter.init();
		sensitiveFilter.addFilterWord("江小白");
		String s = sensitiveFilter.filterword(remark);
		System.out.println(s);
		
		
		
	}

}
