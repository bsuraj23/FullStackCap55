package JavaHandsOn;

class Student{
	private String name,address;
	private double mno;
	public Student(String name,String address,double mno){
		this.name=name;
		this.address=address;
		this.mno=mno;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getMno() {
		return mno;
	}

	public void setMno(double mno) {
		this.mno = mno;
	}

	@Override
	public String toString() {
		return "\n"+name+" -> "+address+" -> "+mno;
	}
}
public class ExEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student("Maheedhar","Chintalapudi",3695);
		System.out.println(stu);

	}

}
