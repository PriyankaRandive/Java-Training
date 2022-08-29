package com.abc;
import java.util.Scanner;

public class PrimeNumbers {

  public static void main(String args[]) {
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 numbers");
    for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextInt();
    }
    checkPrimeNumbers(arr);
  }

  public static void checkPrimeNumbers(int arr[]) {
    loop1:
    for (int j = 0; j < arr.length; j++) {
      loop2:
      for (int i = 2; i < arr[j]; i++) {
        if (arr[j] % i == 0) {
          continue loop1;
        }
      }
      System.out.print(arr[j] + " ");
    }

}}