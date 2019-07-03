package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Delete_dis_publish_course {
public static void delete_dis_publish_course(String uid){
        
        Link lk=new Link();
        try {
            String sql="delete from dis_publish_course where uid=?";
            Connection conn=lk.getCon();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, uid);
            ps.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }

}
