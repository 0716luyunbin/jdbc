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
				System.out.println("�����ɹ�");
				con=(Connection) DriverManager.getConnection
						("jdbc:mysql://127.0.0.1:3306/studb","root","admin");
				System.out.println("�ɹ�����connection");
				Statement sta=(Statement) con.createStatement();
				ResultSet n=sta.executeQuery("select * from studentinfo");
				while(n.next()){
					String xh=n.getString(1);
					System.out.println("ѧ��"+xh);
					String xm=n.getString(2);
					System.out.println("����"+xm);
					int age=n.getInt(3);
					System.out.println("����"+age);
				}
			}catch(ClassNotFoundException e){
				System.out.println("û���ҵ�");
			}catch(SQLException e){
				System.out.println("����ʧ��");
			}
	}
}
