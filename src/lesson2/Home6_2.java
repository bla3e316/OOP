package lesson2;

import java.util.Scanner;
import java.io.*;

public class Home6_2 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
				
		System.out.println("Введите 7ми значное число");
		int chislo =  in.nextInt(); 
		float summ = 0;
		int div = 10;
		for (int i = 1; i <= 7; i++){	//
			summ += chislo % div;		//
			chislo /= div;				//
			
		}
			
		System.out.println("Среднне арифм с цифр числа - " + summ / 7);
		
	}
}
