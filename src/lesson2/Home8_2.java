package lesson2;

import java.util.Scanner;
import java.io.*;

public class Home8_2 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Введите год , я проверю высокосный ли он ");
		int year = in.nextInt(); 
		
		if ((year%4 == 0) && (year%100 == 0)) {
			System.out.println(year + " - " + "Год Не высокосный");
		
		}else if (((year%400 == 0) && (year%100 == 0) && (year%4 == 0)) || (year%4 == 0)) {
			System.out.println(year + " - " + "Год высокосный");
		
		}else{
			System.out.println(year + " - " + "Год Не высокосный");
		}
	}
}
