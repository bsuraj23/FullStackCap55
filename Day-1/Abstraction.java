package CapgeminiTraining;

abstract class Student
{
	public void Stuname()
	{
		System.out.println("Student name is rakesh");
	}
	public abstract void Stuid();
}
class student1 extends Student
{
	@Override
	public void Stuid() {
		System.out.println("Student id is 123");
	}
}
public class Abstraction {
	public static void main(String[] args) {
		student1 coll = new student1();
		coll.Stuname();
		coll.Stuid();
	}
}