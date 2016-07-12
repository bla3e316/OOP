package lesson2;

import java.util.Scanner;
import java.io.*;

public class Home8_1 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Введите год");
		int year = in.nextInt(); 
		
		if ((year % 4 == 0) && (year % 100 == 0)) {
			System.out.println(year + " - " + "Год Не высокосный");
		
		}else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
			System.out.println(year + " - " + "Год высокосный");
		
		}else if (year % 4 == 0){ 
			System.out.println(year + " - " + "Год высокосный");
		
		}else{
			System.out.println(year + " - " + "Год Не высокосный");
		}
	}
}
