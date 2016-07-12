package lesson2;

import java.util.Scanner;

public class Task9 {
	public static void main(String []args){

		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Введите 1 для +");
		System.out.println("Введите 2 для -");
		System.out.println("Введите 3 для *");
		System.out.println("Введите 4 для /");

		int input = scan.nextInt(); /* && обозначает AND , || - OR  ,! - не,  смотри таблицу истиности */
		
		
		if (input >=1 && input<=5) {  /* не забывать при && каждый раз писать INPUT*/
			System.out.println("Давайте что-то посчитаем");
			
			System.out.println("Что будем считать?");
			int val1 = scan.nextInt(); 

			System.out.println("С чем?");
			int val2 = scan.nextInt();
			
			if (val2 == 0) {
				System.out.println("На 0 делить нельзя ");
			}
			
			switch (input){
			case 1:
				System.out.println(val1 + "+" + val2 + "=" + (val1 + val2));
				break;
			case 2:
				System.out.println(val1 + "-" + val2 + "=" + (val1 - val2));
				break;			
			case 3:
				System.out.println(val1 + "*" + val2 + "=" + (val1 * val2));
				break;
			case 4:
				System.out.println(val1 + "/" + val2 + "=" + ((double)val1 / val2)); /*double*/
				break;
				default:
					System.out.println(" Error ");
			}
		
			} 
			else {
			System.out.println("Попробуйте еще раз ");		
		}
	}
}
