package com.abc;


public class HashcodePractice {
	public static void main(String[] args) {
		
	
	String a= "cat";
	String b= "cat";
	if(a.equals(b))
	{
		System.out.println("Strings are equal");
		System.out.println(a.hashCode() +"\n" + b.hashCode());
	}
	String c="dog";
	String d="fox";
	if(!c.equals(d))
			{
		System.out.println("Strings are not equal");
		System.out.println(c.hashCode() +"\n" + d.hashCode());
			}

}
}