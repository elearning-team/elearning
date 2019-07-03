package mysql;
import java.sql.*;

import common.Dis_publish_course;
import common.Dis_publish_course_list;

public class Select_dis_publish_course {
	public static Dis_publish_course_list select_dis_publish_course() {
		Dis_publish_course_list dcl = new Dis_publish_course_list();
        Connection conn = null;
        Statement state = null;
        Link lk=new Link();
        
        try{
//        	System.out.println("�������ݿ�...");
        	conn=lk.getCon();
        
            // ִ�в�ѯ
//            System.out.println(" ���ڲ�ѯ��ֹ�����γ��û���...");
            state = conn.createStatement();
            String sql= "SELECT uid, dpc_reason, dpc_time FROM dis_publish_course"; 
            ResultSet rs = state.executeQuery(sql);
        
            // չ����������ݿ�
            while(rs.next()){
                // ͨ���ֶμ���
                String uid  = rs.getString("uid");
                String dpc_reason = rs.getString("dpc_reason");
                String dpc_time = rs.getString("dpc_time");
    
                Dis_publish_course dpc = new Dis_publish_course();
                dpc.setUid(uid);
                dpc.setDpc_reason(dpc_reason);
                dpc.setDpc_time(dpc_time);
                
                dcl.addDispublish(dpc);
                // �������
//                System.out.print("�û�ID: " + uid);
//                System.out.print(", ����ԭ��: " + upasswd);
//                System.out.print(", ����ʱ��: " + uname);
//                System.out.print("\n");
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
        return dcl;
//        System.out.println("��ѯ���!");
    }

}
