package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import common.Dis_publish_course;

public class Add_dis_publish_course {
public boolean add_dis_publish_course(Dis_publish_course dis_publish_course){
		
		
		
		String Uid=dis_publish_course.getUid();
        String Dpc_reason=dis_publish_course.getDpc_reason();
        long l = System.currentTimeMillis();
		Date date = new Date(l);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      

        Link lk=new Link();
        try {
            String sql="INSERT INTO dis_publish_course(uid,dpc_reason,dpc_time) VALUES (?,?,?)";
            Connection conn=lk.getCon();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, Uid);
            ps.setString(2, Dpc_reason);
            ps.setString(3, dateFormat.format(date));
       
            ps.executeUpdate();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return true;

    }

}
