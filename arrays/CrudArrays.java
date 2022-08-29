package com.arrays;
import java.util.Arrays;
import java.util.Scanner;  
public class CrudArrays   
{  
	
	 public static int[] removeTheElement(int[] arr, int index)
	    {
	 
	        if (arr == null || index < 0 || index >= arr.length) 
	        {
	 
	                     return arr;
	        }
	 
	       
	        int[] anotherArray = new int[arr.length - 1];
	 
	        for (int i = 0, k = 0; i < arr.length; i++) {
	 
	            if (i == index) {
	                continue;
	            }
	 
	            anotherArray[k++] = arr[i];
	        }
	 
	      return anotherArray;
	    }
             public static void main(String[] args)   
            {  
                int n;  
                Scanner sc=new Scanner(System.in);  
                System.out.print("Enter the number of elements you want to store: ");  
                n=sc.nextInt();  

                int[] array = new int[5];  
                System.out.println("Enter the elements of the array: ");  
      
                for(int i=0; i<n; i++)  
              {  
                array[i]=sc.nextInt();  
              }  
                System.out.println("Array elements are: ");  

                for (int i=0; i<n; i++)   
              {  
                System.out.println(array[i]);  
               }  
                System.out.println("Enter index");
                int index=sc.nextInt();
                System.out.println("Index to be removed: " + index);
                array = removeTheElement(array, index);
                System.out.println("Resultant Array: "+ Arrays.toString(array));
      }
      }  
     