package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;

import common.Course;

public class Add_course {
	public boolean addCourse(Course course){
        String Cid=course.getCid();
        String Cname=course.getCname();
        String Cintroduction=course.getCintroduction();
        String Tname=course.getTname();
        int Crun_time=course.getCrun_time();
        int Cprice=course.getCprice();
        int Paycount=course.getPaycount();
        

        Link lk=new Link();
        try {
            String sql="INSERT INTO course(cid,cname,cintroduction,tname,crun_time,cprice,paycount) VALUES (?,?,?,?,?,?,?)";
            Connection conn=lk.getCon();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, Cid);
            ps.setString(2, Cname);
            ps.setString(3, Cintroduction);
            ps.setString(4, Tname);
            ps.setInt(5, Crun_time);
            ps.setInt(6, Cprice);
            ps.setInt(7, Paycount);
       
            ps.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return true;
	}

}
