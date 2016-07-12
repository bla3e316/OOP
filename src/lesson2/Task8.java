package lesson2;

import java.util.Scanner;

public class Task8 {
	public static void main(String []args){

		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Введите 1 для +");
		System.out.println("Введите 2 для -");
		System.out.println("Введите 3 для *");
		System.out.println("Введите 4 для /");

		int input = scan.nextInt(); /* && обозначает AND , || - OR  ,! - не,  смотри таблицу истиности */
		
		
		if (input >=1 && input<=4) {  /* не забывать при && каждый раз писать INPUT*/
			System.out.println("OK");
			
			System.out.println("Что будем считать?");
			int val1 = scan.nextInt(); 

			System.out.println("С чем?");
			int val2 = scan.nextInt();
			
			if (input ==1 ) {
				System.out.println(val1 + "+" + val2 + "=" + (val1 + val2));
			}
			if (input ==2 ) {
				System.out.println(val1 + "-" + val2 + "=" + (val1 - val2));
			}
			if (input ==3 ) {
				System.out.println(val1 + "*" + val2 + "=" + (val1 * val2));
			}
			if (input ==4 ) {
				System.out.println(val1 + "/" + val2 + "=" + ((double)val1 / val2)); /*double*/
			}

		} else {
			System.out.println("NE OK ");	
		
		}	
	
    }
}
