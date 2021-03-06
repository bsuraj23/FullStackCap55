package comparable;

public class User implements Comparable<User>{
	int id;
	String name;
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(User user) {
		// TODO Auto-generated method stub
		
		//return id-user.id;
		return name.compareTo(user.getName());
		
		//"" .equals(" ");
	}
	
	
	
	
	
	
}
