package lesson2;

import java.util.Scanner;
import java.io.*;

public class Home4 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in); 
		System.out.println("Введите имя пользователя");
		String usr = in.next(); 
		System.out.println("Hello" + " " + usr);
		
		System.out.println("Введите число");
		int val = in.nextInt(); 
		
		if ((val % 2) == 0 )  {
			System.out.println("Число "+ val +" - четное");
		}
		else{
			 if ((val % 2) == 1 ){
			System.out.println("Число "+ val +" - нечетное");
			 }
		}
	}
}
