package mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select_course {
	public static void select_course() {
        Connection conn = null;
        Statement state = null;
        Link lk=new Link();
        
        try{
        	System.out.println("�������ݿ�...");
        	conn=lk.getCon();
        
            // ִ�в�ѯ
            System.out.println(" ���ڲ�ѯ�γ̱�...");
            state = conn.createStatement();
            String sql= "SELECT cid, cname, cintroduction,tname,crun_time,cprice,paycount FROM course"; 
            ResultSet rs = state.executeQuery(sql);
        
            // չ����������ݿ�
            while(rs.next()){
                // ͨ���ֶμ���
                String cid  = rs.getString("cid");
                String cname = rs.getString("cname");
                String cintroduction = rs.getString("cintroduction");
                String tname  = rs.getString("tname");
                int crun_time =5;
                int cprice = 6;
                int paycount = 7;
                crun_time = rs.getInt(crun_time);
                cprice = rs.getInt(cprice);
                paycount = rs.getInt(paycount);
                
    
                // �������
                System.out.print("�γ�ID: " + cid);
                System.out.print(", �γ�����: " + cname);
                System.out.print(", �γ̽���: " + cintroduction);
                System.out.print(", �ڿν�ʦ: " + tname);
                System.out.print(", �γ�ʱ��: " + crun_time+" ����");
                System.out.print(", �γ̼۸�: " + cprice+" Ԫ");
                System.out.print(", ѡ������: " + paycount);
                System.out.print("\n");
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
        System.out.println("��ѯ���!");
    }

}
