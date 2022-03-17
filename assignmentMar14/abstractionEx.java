package assignmentMar14;


abstract class getName{
	abstract void name();
}

class data extends getName{
	String name="Vishal Siddartha";
	int id=325;
	@Override
	void name() {
		System.out.println(name);
	}
	
	int getId() {
		return id;
	}
}
public class abstractionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data obj=new data();
		obj.name();
		System.out.println(obj.getId());
	}
}
