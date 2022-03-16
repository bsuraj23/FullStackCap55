package mar16;

import java.util.ArrayList;

public class Main { 
  public static void main(String[] args) { 
    ArrayList<String> companies = new ArrayList<String>();
    companies.add("Capgemini");
    companies.add("Cognizant");
    companies.add("TCS");
    companies.add("Wipro");
    companies.remove(0);
    System.out.println(companies);
  } 
}
