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
           
//            System.out.println("连接数据库...");
            conn=lk.getCon();
        
            // 执行查询
//            System.out.println(" 正在查询被禁用户名单...");
            state = conn.createStatement();
            String sql;
            sql = "SELECT uid, dr_reason, dr_time FROM dis_remark order by dr_time DESC";
            ResultSet rs = state.executeQuery(sql);
        
            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
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
            // 完成后关闭
            rs.close();
            state.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(state!=null) state.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
//        System.out.println("查询完毕!");
//        System.out.println(count);
		return Dr;
    }
	
	
}
