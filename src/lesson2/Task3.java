package lesson2;

import java.util.Scanner;  /*подключаем  инструмент*/

public class Task3 {
	public static void main(String []args){
		
		Scanner scan = new Scanner(System.in);  /*Создаем инструмент*/
		
		System.out.println("Введите число");
		
		int val1 = scan.nextInt(); /*Используем созданный сканнер (блокирующий ввод ожидающий ввода с консоли)*/
	
		System.out.println("Введите еще разок");

		int val2 = scan.nextInt(); /*Используем созданный сканнер (блокирующий ввод ожидающий ввода с консоли)*/

		
		System.out.println(val1 + " + " + val2 + " * " + val1 + " = " + (val1 + val2 * val1));
		
		
		System.out.println("Вы ввели : ");


		System.out.println(val1 + val2 * val1);		
		
		

	}			
}
