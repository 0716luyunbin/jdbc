import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class Text {
	public static void main(String[] args){
		Connection con=null;
		try{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("创建成功");
				con=(Connection) DriverManager.getConnection
						("jdbc:mysql://127.0.0.1:3306/studb","root","admin");
				System.out.println("成功连接connection");
				Statement sta=(Statement) con.createStatement();
				ResultSet n=sta.executeQuery("select * from studentinfo");
				while(n.next()){
					String xh=n.getString(1);
					System.out.println("学号"+xh);
					String xm=n.getString(2);
					System.out.println("姓名"+xm);
					int age=n.getInt(3);
					System.out.println("年龄"+age);
				}
			}catch(ClassNotFoundException e){
				System.out.println("没有找到");
			}catch(SQLException e){
				System.out.println("连接失败");
			}
	}
}
