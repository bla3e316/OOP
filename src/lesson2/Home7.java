package lesson2;

import java.util.Scanner;
import java.lang.Math;
import java.io.*;

public class Home7 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
				
		System.out.println("Введите коефициенты квадратного уравнения ax^2 + bx + c");
		System.out.println("Введите значное a");
		int a =  in.nextInt(); 
		System.out.println("Введите значное b");
		int b =  in.nextInt(); 
		System.out.println("Введите значное c");
		int c =  in.nextInt();
		System.out.println("Введите значное x");
		int x =  in.nextInt(); 
		
		if (a==0 && b==0 && c==0){
		System.out.println("Нет действительных решений уравнения");
		}
		
		else if (a == 0) {	
		System.out.println("Первый коэффициент не может быть 0");		
		}
		else
		System.out.println("ax^2 + bx + c = " + (a * (Math.pow(x, 2)) + b*x + c) );	
		System.out.println(a + "*" + (x*x) + "+" + b + "*" + x +"+"+ c + "="   + (a * (Math.pow(x, 2)) + b*x + c) );		
	}
}
