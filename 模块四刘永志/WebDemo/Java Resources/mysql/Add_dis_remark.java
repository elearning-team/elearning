package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import mysql.Link;
import common.Dis_remark;

public class Add_dis_remark {

public boolean add_disremark(Dis_remark dis_remark){
		
		
		
		String Uid=dis_remark.getUid();
        String Dr_reason=dis_remark.getDr_reason();
        long l = System.currentTimeMillis();
		Date date = new Date(l);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      

        Link lk=new Link();
        try {
            String sql="INSERT INTO dis_remark(uid,dr_reason,dr_time) VALUES (?,?,?)";
            Connection conn=lk.getCon();
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, Uid);
            ps.setString(2, Dr_reason);
            ps.setString(3, dateFormat.format(date));
       
            ps.executeUpdate();
            
            conn.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return true;

    }
}
