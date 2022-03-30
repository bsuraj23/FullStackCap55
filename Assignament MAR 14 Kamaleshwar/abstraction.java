package Abstractclass;
public abstract class Human {
	public abstract void play();//only declaration should be done inside abstract class
	public void sit()
	{
		
	}

}
public class Man extends Human{
	public void play() {//method defenition 
		System.out.println("playing");
	}

}

public class AbstractDemoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human m=new Man();
		m.play();

	}

}
