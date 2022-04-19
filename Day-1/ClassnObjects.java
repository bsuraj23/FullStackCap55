package CapgeminiTraining;
class student2
{
	String name;
	String section;
	int id;
	public void stdinfo()
	{
		System.out.println("NAME : "+""+this.name);
		System.out.println("SECTION : "+""+this.section);
		System.out.println("ID : "+""+this.id);
	}
}
public class ClassnObjects {
	public static void main(String[] args) {
		student2 s1 =new student2();
		s1.name = "Sriram";
		s1.section = "CSE4";
		s1.id=256;
		s1.stdinfo();
	}

} 

