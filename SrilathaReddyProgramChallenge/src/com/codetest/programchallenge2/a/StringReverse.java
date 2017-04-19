package com.codetest.programchallenge2.a;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {

		  Scanner sc=null;
		  try{
			  sc =new Scanner(System.in);
		  System.out.println("Enter String :");
		  String n = sc.nextLine();
		  String rev = "";
		  int len=n.length();
		  for(int i=len-1;i>=0;i--)
		  {
		   rev=rev+n.charAt(i);   
		  }
		  System.out.println("Reverse of Given String is :");
		  System.out.println(""+rev); 
		  }catch(Exception e){
			  e.printStackTrace();
		  }finally{
			  if(null != sc){
				  sc.close();
			  }
		  }
	}
}
