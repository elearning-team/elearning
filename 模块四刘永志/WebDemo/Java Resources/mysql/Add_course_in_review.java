package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;

import common.Course_in_review;

public class Add_course_in_review {
	public boolean add_Course_in_review(Course_in_review course_in_review){
        String Cid=course_in_review.getCid();
        String Cname=course_in_review.getCname();
        String Cintroduction=course_in_review.getCintroduction();
        String Tname=course_in_review.getTname();
        int Crun_time=course_in_review.getCrun_time();
        int Cprice=course_in_review.getCprice();
        
        

        Link lk=new Link();
        try {
            String sql="INSERT INTO course_in_review(cid,cname,cintroduction,tname,crun_time,cprice) VALUES (?,?,?,?,?,?)";
            Connection conn=lk.getCon();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, Cid);
            ps.setString(2, Cname);
            ps.setString(3, Cintroduction);
            ps.setString(4, Tname);
            ps.setInt(5, Crun_time);
            ps.setInt(6, Cprice);
       
            ps.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return true;
	}

}
