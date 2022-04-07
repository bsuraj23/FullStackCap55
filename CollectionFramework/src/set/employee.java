package set;

public class employee {

	int id;
	String name;
	
	public employee(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	public String toString()
	{
		return "employee[ id=" +id+ ", name=" +name+"]";
	}
}
