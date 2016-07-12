package lesson2;

import java.util.Scanner;

public class Task4 {
	public static void main(String []args){
		
		Scanner scan = new Scanner(System.in); 

		System.out.println("Введите первое число");
		int val1 = scan.nextInt(); 
		
		System.out.println("Введите второе число");
		int val2 = scan.nextInt(); 

		double zadacha = Math.pow(val1, 1.0 / val2);   /* задачка на вичисление корня квадратного 2го числа из 1го */ 
		
		System.out.println(zadacha);


	
	}	

}
