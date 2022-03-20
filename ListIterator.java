public class ListIterator
{
  public static void main(String[] args) 
  {
	List<String&gt names = new LinkedList<>();
	names.add("Yeontan");
	names.add("Yejin");
	names.add("Suga");
		
	ListIterator<String&gt namesIterator = names.listIterator();
	
	while(namesIterator.hasNext()){
	   System.out.println(namesIterator.next());			
	}	

	for(String name: names){
	   System.out.println(name);			
	}	
  }
}