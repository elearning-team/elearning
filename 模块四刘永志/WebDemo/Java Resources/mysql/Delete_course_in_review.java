package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Delete_course_in_review {
public static void delete_course_in_review(String cid){
        
        Link lk=new Link();
        try {
            String sql="delete from course_in_review where cid=?";
            Connection conn=lk.getCon();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, cid);
            ps.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }

}
