package common;

public class Course_in_review {
	private String Cid;
	private String Cname;
	private String Cintroduction;
	private String Tname;
	private int Crun_time;
	private int Cprice;
	private int Paycount;
	
	public String getCid() {
        return Cid;
    }
    public void setCid(String cid) {
        Cid = cid;
    }
    public String getCname() {
        return Cname;
    }
    public void setCname(String cname) {
    	Cname = cname;
    }
    public String getCintroduction() {
        return Cintroduction;
    }
    public void setCintroduction(String cintroduction) {
    	Cintroduction = cintroduction;
    }
    public String getTname() {
        return Tname;
    }
    public void setTname(String tname) {
    	Tname = tname;
    }
    public int getCrun_time() {
        return Crun_time;
    }
    public void setCrun_time(int crun_time) {
    	Crun_time = crun_time;
    }
    public int getCprice() {
        return Cprice;
    }
    public void setCprice(int cprice) {
    	Cprice = cprice;
    }

}
