package comparablecheck;

public class user implements Comparable <user> {
	int id;
	String name;
	
	user(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String toString() {
		return id+ " "+name;
	}
	
	public int compareTo(user user) {
		return id-user.id;
		
	}

}
