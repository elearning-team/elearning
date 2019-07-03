package mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.*;
import mysql.Link;

public class Select_dis_remark {

	public Dis_remark_list select_disremark() {
    	Dis_remark_list Dr=new Dis_remark_list();
    	
        Connection conn = null;
        Statement state = null;
        Link lk=new Link();
//        int count=1;
        try{
           
//            System.out.println("�������ݿ�...");
            conn=lk.getCon();
        
            // ִ�в�ѯ
//            System.out.println(" ���ڲ�ѯ�����û�����...");
            state = conn.createStatement();
            String sql;
            sql = "SELECT uid, dr_reason, dr_time FROM dis_remark order by dr_time DESC";
            ResultSet rs = state.executeQuery(sql);
        
            // չ����������ݿ�
            while(rs.next()){
                // ͨ���ֶμ���
                String uid  = rs.getString("uid");
                String dr_reason = rs.getString("dr_reason");
                String dr_time = rs.getString("dr_time");
    
                Dis_remark dis = new Dis_remark();
                dis.setUid(uid);
                dis.setDr_reason(dr_reason);
                dis.setDr_time(dr_time);
                
//                String user=uid+","+dr_reason+","+dr_time;
//                System.out.println("123");
                Dr.addDiseamark(dis);
//                count++;
//                return Dr;
                
            }
            // ��ɺ�ر�
            rs.close();
            state.close();
            conn.close();
        }catch(SQLException se){
            // ���� JDBC ����
            se.printStackTrace();
        }catch(Exception e){
            // ���� Class.forName ����
            e.printStackTrace();
        }finally{
            // �ر���Դ
            try{
                if(state!=null) state.close();
            }catch(SQLException se2){
            }// ʲô������
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
//        System.out.println("��ѯ���!");
//        System.out.println(count);
		return Dr;
    }
	
	
}
