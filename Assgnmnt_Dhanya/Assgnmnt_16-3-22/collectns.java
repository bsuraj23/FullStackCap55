import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;


public class collectns {
	

	   public static void main(String[] args) {
	      List lnkLst = new LinkedList();
	      lnkLst.add("element1");
	      lnkLst.add("element2");
	      lnkLst.add("element3");
	      lnkLst.add("element4");
	      System.out.println("Linked list elements");
	      displayAll(lnkLst);
	      lnkLst.remove("element2");
	      System.out.println("\nAfter removing 2nd element");
	      displayAll(lnkLst);
	      System.out.println("***********************************************");
		   
	      
	      List aryLst = new ArrayList();
	      aryLst.add("x");
	      aryLst.add("y");
	      aryLst.add("z");
	      aryLst.add("w");
	      System.out.println("\nArrayList elements");
	      displayAll(aryLst);
	      aryLst.remove("y");
	      System.out.println("\nAfter removing 2nd element");
	      displayAll(aryLst);
	      System.out.println("***********************************************");
	      
	      
	      Set hashSet = new HashSet();
	      hashSet.add("set1");
	      hashSet.add("set2");
	      hashSet.add("set3");
	      hashSet.add("set4");
	      System.out.println("\nHashSet elements");
	      displayAll(hashSet);
	      hashSet.remove("set2");
	      System.out.println("\nAfter removing 2nd element");
	      displayAll(hashSet);
	      System.out.println("***********************************************");
	      
	      
	      
	      SortedSet treeSet = new TreeSet();
	      treeSet.add("1");
	      treeSet.add("2");
	      treeSet.add("3");
	      treeSet.add("4");
	      System.out.println("\nTreeSet elements");
	      displayAll(treeSet);
	      treeSet.remove("4");
	      System.out.println("\nAfter removing 4th element");
	      displayAll(treeSet);
	      System.out.println("***********************************************");
	      
	      LinkedHashSet lnkHashset = new LinkedHashSet();
	      lnkHashset.add("one");
	      lnkHashset.add("two");
	      lnkHashset.add("three");
	      lnkHashset.add("four");
	      System.out.println("\nLinkedHashSet elements");
	      displayAll(lnkHashset);
	      lnkHashset.remove("one");
	      System.out.println("\nAfter removing 1st element");
	      displayAll(lnkHashset);
	      System.out.println("***********************************************");
	      
	      
	      Map map1 = new HashMap();
	      map1.put("key1", "J");
	      map1.put("key2", "K");
	      map1.put("key3", "L");
	      map1.put("key4", "M");
	      System.out.println("\nHashMap elements");
	      displayAll(map1.keySet());
	      displayAll(map1.values());
	      map1.remove("key4", "M");
	      System.out.println("\nAfter removing 4th element");
	      displayAll(map1.keySet());
	      displayAll(map1.values());
	      System.out.println("***********************************************");
	      
	      SortedMap map2 = new TreeMap();
	      map2.put("key1", "JJ");
	      map2.put("key2", "KK");
	      map2.put("key3", "LL");
	      map2.put("key4", "MM");
	      System.out.println("\nSortedMap elements");
	      displayAll(map2.keySet());
	      displayAll(map2.values());
	      map2.remove("key4", "MM");
	      System.out.println("\nAfter removing 4th element");
	      displayAll(map2.keySet());
	      displayAll(map2.values());
	      System.out.println("***********************************************");
	      
	      LinkedHashMap map3 = new LinkedHashMap();
	      map3.put("key1", "JJJ");
	      map3.put("key2", "KKK");
	      map3.put("key3", "LLL");
	      map3.put("key4", "MMM");
	      System.out.println("\nLinkedHashMap elements");
	      displayAll(map3.keySet());
	      displayAll(map3.values());
	      map3.remove("key2", "KKK");
	      System.out.println("\nAfter removing 2nd element");
	      displayAll(map3.keySet());
	      displayAll(map3.values());
	      System.out.println("***********************************************");
	      
	   }
	   static void displayAll(Collection col) {
		      Iterator itr = col.iterator();
		      while (itr.hasNext()) {
		         String str = (String) itr.next();
		         System.out.print(str + " ");
		      }
		      System.out.println();
		   }

}
