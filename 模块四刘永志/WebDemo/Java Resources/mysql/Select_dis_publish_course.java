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
//        	System.out.println("连接数据库...");
        	conn=lk.getCon();
        
            // 执行查询
//            System.out.println(" 正在查询禁止发布课程用户表...");
            state = conn.createStatement();
            String sql= "SELECT uid, dpc_reason, dpc_time FROM dis_publish_course"; 
            ResultSet rs = state.executeQuery(sql);
        
            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                String uid  = rs.getString("uid");
                String dpc_reason = rs.getString("dpc_reason");
                String dpc_time = rs.getString("dpc_time");
    
                Dis_publish_course dpc = new Dis_publish_course();
                dpc.setUid(uid);
                dpc.setDpc_reason(dpc_reason);
                dpc.setDpc_time(dpc_time);
                
                dcl.addDispublish(dpc);
                // 输出数据
//                System.out.print("用户ID: " + uid);
//                System.out.print(", 被禁原因: " + upasswd);
//                System.out.print(", 被禁时间: " + uname);
//                System.out.print("\n");
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
        return dcl;
//        System.out.println("查询完毕!");
    }

}
