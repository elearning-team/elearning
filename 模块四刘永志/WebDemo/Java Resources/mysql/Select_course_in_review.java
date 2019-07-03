package mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select_course_in_review {
	public static void select_course_in_review() {
        Connection conn = null;
        Statement state = null;
        Link lk=new Link();
        
        try{
        	System.out.println("连接数据库...");
        	conn=lk.getCon();
        
            // 执行查询
            System.out.println(" 正在查询待审核课程表...");
            state = conn.createStatement();
            String sql= "SELECT cid, cname, cintroduction,tname,crun_time,cprice FROM course_in_review"; 
            ResultSet rs = state.executeQuery(sql);
        
            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                String cid  = rs.getString("cid");
                String cname = rs.getString("cname");
                String cintroduction = rs.getString("cintroduction");
                String tname  = rs.getString("tname");
                int crun_time =5;
                int cprice = 6;
                
                crun_time = rs.getInt(crun_time);
                cprice = rs.getInt(cprice);
                
                
    
                // 输出数据
                System.out.print("课程ID: " + cid);
                System.out.print(", 课程名称: " + cname);
                System.out.print(", 课程介绍: " + cintroduction);
                System.out.print(", 授课教师: " + tname);
                System.out.print(", 课程时长: " + crun_time+" 分钟");
                System.out.print(", 课程价格: " + cprice+" 元");
                
                System.out.print("\n");
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
        System.out.println("查询完毕!");
    }

}
