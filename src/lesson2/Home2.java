package lesson2;

import java.util.Scanner;
import java.io.*;

public class Home2 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in); 
		System.out.println("Введите имя пользователя");
		String usr = in.next(); 
		System.out.println("Hello" + " " + usr);
		
		System.out.println("Введите 1-е число");
		int val1 = in.nextInt(); 
		System.out.println("Введите 2-е число");
		int val2 = in.nextInt(); 
		System.out.println("Введите 3-е число");
		int val3 = in.nextInt(); 
		
		if ((val1 > val2) && (val1 > val3) && (val2 > val3))  {
			System.out.println("Большее - " + val1 + ",  Меньшее - " + val3 + "");
		}
		if ((val1 > val2) && (val1 > val3) && (val2 < val3))  {
			System.out.println("Большее - " + val1 + ",  Меньшее - " + val2 + "");
		}
		if ((val2 > val1) && (val2 > val3) && (val1 > val3))  {
			System.out.println("Большее - " + val2 + ",  Меньшее - " + val3 + "");
		}
		if ((val2 > val1) && (val2 > val3) && (val1 < val3))  {
			System.out.println("Большее - " + val2 + ",  Меньшее - " + val1 + "");
		}
		if ((val3 > val1) && (val3 > val2) && (val1 > val2))  {
			System.out.println("Большее - " + val3 + ",  Меньшее - " + val2 + "");
		}
		if ((val3 > val1) && (val3 > val2) && (val1 < val2))  {
			System.out.println("Большее - " + val3 + ",  Меньшее - " + val1 + "");
		}
	}
}
