package model;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {
	public static BasicDataSource getSource(){
		BasicDataSource obj=new BasicDataSource();
		obj.setDriverClassName("com.mysql.jdbc.Driver");
		obj.setUsername("root");
		obj.setPassword("root");
		obj.setUrl("jdbc:mysql://localhost:3306/Student");
		return obj;
	}
	public static JdbcTemplate getTemplate()
	{
		JdbcTemplate obj=new JdbcTemplate();
		obj.setDataSource(getSource());
		return obj;
	}
}
