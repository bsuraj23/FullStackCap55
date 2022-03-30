package collections;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list=new ArrayList<String>();
list.add("naga");
list.add("vara");
list.add("Maya");
list.add("sara");
System.out.println(list);
ArrayList<String> list1=new ArrayList<String>();
list1.addAll(list);
list1.add("sundar");
System.out.println(list1);
ArrayList<String> list3=new ArrayList<String>();
for(int i=0;i<list1.size();i++) {
	System.out.println(list1.get(i));
for(String st:list1) {
	System.out.println(st);
}
list1.forEach(st->System.out.println(st));
int y=0;
while(y<list1.size()) {
	System.out.println(list1.get(y));
	y++;
}
java.util.Iterator<String> it=list1.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

	}



Collections.sort(list1);
System.out.println(list1);
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);
	}

}
