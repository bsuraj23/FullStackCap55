package OOPS;

class Encapsulate {
	private String Name;
	private int Roll;
	private int Age;

	public int getAge() { return Age; }

	public String getName() { return Name; }

	public int getRoll() { return Roll; }

	public void setAge(int newAge) { Age = newAge; }

	public void setName(String newName)
	{
		Name = newName;
	}

	public void setRoll(int newRoll) { Roll = newRoll; }
}

public class TestEncapsulation {
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();
		obj.setName("Govind");
		obj.setAge(22);
		obj.setRoll(39);
		System.out.println("Geek's name: " + obj.getName());
		System.out.println("Geek's age: " + obj.getAge());
		System.out.println("Geek's roll: " + obj.getRoll());
	}
}
