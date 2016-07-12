package lesson2;

import java.util.Scanner;
import java.io.*;


public class Home1 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in); 
		System.out.println("Введите имя пользователя");
		String usr = in.next(); 
		System.out.println("Hello" + " " + usr);

		
		System.out.println("Введите первое число");
		int val1 = in.nextInt(); 
		System.out.println("Введите второе число");
		int val2 = in.nextInt(); 
		
		System.out.println(val1 + "+" + val2 + "=" + (val1 + val2));

	
	}

}
