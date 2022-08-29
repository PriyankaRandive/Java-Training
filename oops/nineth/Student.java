package com.oops.nineth;

public class Student {
	public static void main(String[] args) 
    {
		Student s1 = new Student();
		Student s2 = new Student();
		
        s1 = null;
        s2= null;
        System.gc();
        System.out.println("Garbage collector is called");   
    }
    
    @Override
    protected void finalize()
    {
        System.out.println("Finalize method is called.");
    }

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	} 
		
		
}
