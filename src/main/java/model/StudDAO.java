package model;

public class StudDAO {
	void Add(Student stud)
	{
		String query="insert into Student(id,name) values (?,?)";
		Object[] params={stud.getid(),stud.getName()};
		ConnectionUtil.getTemplate().update(query,params);
	}

}
