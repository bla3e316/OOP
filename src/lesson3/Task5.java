package lesson3;

import java.util.Scanner;
import java.io.*;

public class Task5 {
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		
		int rnd = (int)( Math.random() * 100);
		int input;
		int count = 0;
		int modul;
		do{	
			count++;
			System.out.println("Введите число");
			input = scan.nextInt();
			
			if ((Math.abs(input-rnd) <= 3) && (count <11 ) && (Math.abs(input-rnd) != 0)){
				System.out.println("Гарячо !" );
				
			}else if ((input > rnd) && (count < 11)){
				System.out.println("твое Число больше");
			
			}else if ((input < rnd) && (count < 11)) {
				System.out.println(" твое Число меньше");    			// бинарный поиск - деление
 			
			}else if ((input == rnd) && (count < 11)) {
 				System.out.println("Ураа, " + "тебе нужно было " + count +  " попытки" + " чтобы угадать число - " + rnd );
 			
			}else if (count > 10){
 				System.out.println("Количество попыток > 10 " + " Я загадал -" +rnd);
 				input = rnd;
 			}
			modul = Math.abs(input-rnd);
			// count++; // count = ++count;
				//System.out.println(modul + " modul, "  + input + " input, " + rnd + " rnd");

			
		} while (rnd != input);
		
	}	
}
