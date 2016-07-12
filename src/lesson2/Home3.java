package lesson2;

import java.util.Scanner;
import java.io.*;


public class Home3 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in); 
		System.out.println("Введите имя пользователя");
		String usr = in.next(); 
		System.out.println("Hello" + " " + usr);

		
		System.out.println("Введите первое число");
		int val1 = in.nextInt(); 
		System.out.println("Введите второе число");
		int val2 = in.nextInt(); 
		
		
		if (val1 > val2) {
			System.out.println(val1);
		}
		if (val2 > val1) {
			System.out.println(val2);
		}
		
		else {
		System.out.println("Числа равны ");	
		}

	
	}

}
