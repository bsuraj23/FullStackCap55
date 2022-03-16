
import java.util.*;  
public class ListEnumeratorEx {  
    public static void main(String[] args) {          
        Vector<String> Enum = new Vector<String>();         
            Enum.add("JAVA");  
            Enum.add("JSP");  
            Enum.add("SERVLET");  
            Enum.add("C");  
            Enum.add("PHP");  
            Enum.add("PERL");  
             
            Enumeration<String> en = Collections.enumeration(Enum);  
            System.out.println("The Enumeration List are: ");  
            while(en.hasMoreElements()){  
                 System.out.println(en.nextElement());  
            }          
    }       
}  
