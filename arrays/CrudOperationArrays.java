package com.arrays;
import java.util.ArrayList;
import java.util.Scanner;


	public class CrudOperationArrays {
		
	    static Scanner scan = new Scanner(System.in);
	    static ArrayList<String> petList;

	    public static void main(String[] args) {

	        showMainMenu();
	        scan.close();
	    }

	    public static void showMainMenu() {
	        System.out.println("menu");
	        System.out.println("1. Create Pet");
	        System.out.println("2. Update Pet");
	        System.out.println("3. Delete Pet");
	        System.out.println("4. Exit");

	        System.out.print("Enter your Choice : ");

	        int option = scan.nextInt();

	        switch (option) {
	            case 1:
	                createPet();
	                break;
	            case 2:
	                updatePet();
	                break;
	            case 3:
	                deletePet();
	                break;
	            case 4:
	                System.exit(0);
	                break;
	            default:
	                System.out.println("Invalid option!");
	                showMainMenu();
	        }

	    }

	    public static void createPet() {
	        Scanner myObj = new Scanner(System.in);

	        System.out.print("Enter Pet Name: ");
	        String newPet = myObj.nextLine();

	        String newPetArray[] = newPet.split(" ");
	        petList = new ArrayList<>();

	        for (int i = 0; i < newPetArray.length; i++) {
	            petList.add(newPetArray[i]);
	        }
	        System.out.println("pets in list are " + petList);
	        showMainMenu();
	    }

	    public static void updatePet() {

	        System.out.println("Enter the name of the pet to be updated");
	        String name = scan.next();
	        System.out.println("Enter the updated name");
	        String newName = scan.next();
	        for (int i = 0; i < petList.size(); i++) {
	            if (petList.get(i).equals(name)) {
	                petList.set(i, newName);
	                break;
	            }
	        }
	        System.out.println("pets in list after updating the pet  " + petList);
	        showMainMenu();
	    }

	    public static void deletePet() {
	        System.out.println("Enter the name of the pet to be deleted");
	        String name = scan.next();
	        for (int i = 0; i < petList.size(); i++) {
	            if (petList.get(i).equals(name)) {
	                petList.remove(i);
	                break;
	            }
	        }
	        System.out.println("pets in list after deleting the specific pet " + petList);
	        showMainMenu();
	    }
	}


