enum games 
{
    ludo, Chess, Badminton, Cricket;
 
}

public class Enumrtr {

     public static void main(String[] args) {       

 
    	 System.out.println("Using for each loop");
    	 for (games index:games.values()) 
    	 {
    		 System.out.println(index);
    	 }
 
     }
}


