package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Link {

	private String url="jdbc:mysql://localhost:3306/elearning?useSSL=false&serverTimezone=UTC";
    private String user="root";
    private String password="123456";
    private String driver="com.mysql.cj.jdbc.Driver";

    public Connection getCon() throws Exception{
                 Class.forName(driver);
                Connection conn=DriverManager.getConnection(url, user, password);
                
                return conn;
    
    }
    
    public static void getClose(Connection conn) throws SQLException{
        if(conn!=null){
            conn.close();
        }

    }

}
