package com.capg.Inheritance;
class Grandparent {
	int GrandParentAge;
	String GrandParentName;
    @Override
	public String toString() {
		return "Grandparent [GrandParentAge=" + GrandParentAge + ", GrandParentName=" + GrandParentName + "]";
	}
	public void setGrandParentAge(int grandParentAge) {
		GrandParentAge = grandParentAge;
	}
	public void setGrandParentName(String grandParentName) {
		GrandParentName = grandParentName;
	}
	public void Print()
    {
        System.out.println("Grandparent's Print()");
    }
}
 
class Parent1 extends Grandparent {
	int ParentAge;
	@Override
	public String toString() {
		return "Parent1 [ParentAge=" + ParentAge + ", ParentName=" + ParentName + "]";
	}
	public void setParentAge(int parentAge) {
		ParentAge = parentAge;
	}
	String ParentName;
    public void setParentName(String parentName) {
		ParentName = parentName;
	}
	public void Print()
    {
        super.Print();
        System.out.println("Parent's Print()");
    }
}
 
class Child1 extends Parent1 {
	int ChildAge;
	String ChildName;
    @Override
	public String toString() {
		return "Grandparent [GrandParentAge=" + GrandParentAge + ", GrandParentName=" + GrandParentName + "]\n"
				+ "Parent1 [ParentAge=" + ParentAge + ", ParentName=" + ParentName + "]\n"
				+ "Child1 [ChildAge=" + ChildAge + ", ChildName=" + ChildName + "]";
	}
	public void setChildAge(int childAge) {
		ChildAge = childAge;
	}
	public void setChildName(String childName) {
		ChildName = childName;
	}
	public void Print()
    {
        super.Print();
        System.out.println("Child's Print()");
    }
}
public class SOrce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c = new Child1();
		//fROM CHILD OBJECT SETTING VALUES TO GRANDPARENT MEMEBERS
		c.setGrandParentAge(80);
		c.setGrandParentName("RAJ");
		//fROM CHILD OBJECT SETTING VALUES TO PARENT MEMEBERS
		c.setParentAge(49);
		c.setParentName("FREDRIC");
		//fROM CHILD OBJECT SETTING VALUES TO CHILD MEMEBERS
		c.setChildAge(21);
		c.setChildName("ENOCK");
	
		System.out.println(c);
		System.out.println();
        c.Print();

	}

}
