package Assignment21Mar;

import java.io.*; 
import java.net.*; 

public class GetCookies { 

    public static void showCookies(String websiteURL)  throws IOException {
        CookieManager cookieManager = new CookieManager(); 
        CookieHandler.setDefault(cookieManager); 
        
        URL url = new URL(websiteURL); 
        URLConnection urlConnection = url.openConnection(); 
        urlConnection.getContent();

        CookieStore cookieStore = cookieManager.getCookieStore(); 


        for (HttpCookie cookie : cookieStore.getCookies()) { 
            System.out.println("\n Cookie: " + cookie.getName()); 
            System.out.println("\t Domain: " + cookie.getDomain()); 
            System.out.println("\t Value: " + cookie.getValue());
        } 
    }
    public static void main(String[] args) throws IOException { 

        showCookies("https://stackoverflow.com/");
        showCookies("https://www.google.com/");
    } 
}