import java.util.ArrayList;

public class DeleteArrayList {
	public static void main(String[] args) { 
	    ArrayList<String> choco= new ArrayList<String>();
	    choco.add("Silk");
	    choco.add("Snikers");
	    choco.add("hersheys");
	    choco.add("perk");
	    choco.remove(0);
	    System.out.println(choco);
	  } 

}
