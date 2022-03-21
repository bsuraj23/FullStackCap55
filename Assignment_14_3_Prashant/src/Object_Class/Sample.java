package Object_Class;

class Class{
	private String msg;
	Class(){
		this.msg="Prashant";
	}
	@Override
	public String toString() {
		return msg;
	}
}

public class Sample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class obj=new Class();
		System.out.println(obj);
	}
}
