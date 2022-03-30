package CapgeminiTraining;
class college
{
	public void student(String name,int id)
	{
		System.out.println("Name : "+""+name+"\n"+"ID : "+id);
	}
	public void student(double cgpa)
	{
		System.out.println("CGPA : "+cgpa);
	}
	public void student(String sec)
	{
		System.out.println("section : "+sec);
	}
}
public class polymorphism {
	public static void main(String[] args) {
		college std = new college();
		std.student("Sriram",256);
		std.student(7.48);
		std.student("CSE4");
	}
}