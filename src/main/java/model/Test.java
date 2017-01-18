package model;

public class Test {
	public static void main(String []args){
		Student obj=new Student();
		StudDAO obj1=new StudDAO();
		obj.SetName("ganesh");
		obj.setId(2);
		obj1.Add(obj);
		
	}
	
}
