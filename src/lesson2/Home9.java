package lesson2;

import java.util.Scanner;
import java.io.*;

public class Home9 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
				
		System.out.println("Введите координаты точчки в декартовой системе коодинат");
		
		long x =  in.nextLong();
		System.out.println("x = " + x);
		long y =  in.nextLong();
		System.out.println("y = " + y);

		if (x == 0 && y == 0){
			
			System.out.println("Точка находится между четвертями , 0");
		}
		else if (x >= 0 && y >= 0){
			System.out.println("Точка находится в 1-й четверти");
		}
		else if (x <= 0 && y >= 0){
			System.out.println("Точка находится в 2-й четверти");
		}
		else if (x <= 0 && y <= 0){
			System.out.println("Точка находится в 3-й четверти");
		}
		else if (x >= 0 && y <= 0){
			System.out.println("Точка находится в 4-й четверти");
		}
		
	}
}
