package Encapsulation;


class Employee {
	   private String name;
	   private int id;

	   public String getName() {
	      return name;
	   }
	   public int getId() {
	      return id;
	   }
	   
	   public void setName(String name) {
	      this.name = name;
	   }

	   public void setId(int id) {
	      this.id = id;
	   }
	}



public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1=new Employee();
		E1.setName("A Prashant");
		E1.setId(344);
		
		System.out.println("Name: "+E1.getName());
		System.out.println("ID  : "+E1.getId());
	}

}
