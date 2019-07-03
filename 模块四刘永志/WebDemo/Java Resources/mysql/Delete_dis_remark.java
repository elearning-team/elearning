package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;

import mysql.Link;

public class Delete_dis_remark {
public static void Delete_disremark(String uid){
        
        Link lk=new Link();
        try {
            String sql="delete from dis_remark where uid=?";
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