package lesson2;

import java.util.Scanner;
import java.io.*;

public class Home8 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Введите год , я проверю высокосный ли он");
		int year = in.nextInt(); 
		
		if ((year%4 == 0) && (year%100 != 0) || (year % 400 == 0)) {
//1900	   ((true(1)  &&  false(0)) = false(0) || false(0) = (false(0)) === false(0) "Год Не высокосный"
//2000	   ((true(1)  &&  false(0)) = false(0) || true(1) = (true(1)) === true(1)      "Год высокосный"  
//2004	   ((true(1)  &&  true(1)) = true(1) || false(0) = (false(0)) === true(1)    "Год высокосный"

			System.out.println(year + " - " + "Год высокосный");
		
		}else{
			System.out.println(year + " - " + "Год Не высокосный");
		}
	}
}
