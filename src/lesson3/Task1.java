package lesson3;

import java.util.Scanner;
import java.io.*;

public class Task1 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in); 
	int a=10;
	int b=20;
	int c=30;
	
	int max = Math.max(Math.max(a, b), c);
	int min = Math.min(Math.min(a, b), c);

	System.out.println("Maks " + max + "; Min " + min);
	
		
	}
}