package assignmentMar14;


class Information {  
  
	private String name,email;  
	//public getter and setter methods  
	 
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}    
	  
}  
	public class encapsulationEx {
		public static void main(String[] args) {    
	    Information info=new Information();    
	    info.setName("Vishal Siddartha");  
	    info.setEmail("vishalsiddartha@gmail.com");  
  
	    System.out.println(info.getName()+"  "+info.getEmail());  
	}  
}  
