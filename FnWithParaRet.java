package com.org.basicPrograms;

public class FnWithParaRet {
	public static String withParamReturn(String Firstname,String lastname){
		System.out.println("This is the function with Parameter and Return type: ");
		return Firstname+" "+lastname;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result=withParamReturn("Enock Harris", "Suhas");
		System.out.println(result);
	}

}
//Enock Harris Suhas