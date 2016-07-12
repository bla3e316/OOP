package lesson2;

import java.util.Scanner;
import java.io.*;

public class Home5 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Введите певую переменную");
		byte val1 = in.nextByte(); 
		
		System.out.println("Введите вторую переменную");
		float val2 = in.nextFloat(); 
		
		System.out.println("Byte" + "  " + val1);
		System.out.println("Float" + " " + val2);
		
		
		
		
										 /* x = 1; y = 3  */
		val1 *= val2;                    /* x = x + y = 1 +(*) 3 = 4 */
		val2 = (byte)(val1 / val2);      /* y = x - y = 4 -(/) 3 = 1  */
		val1 /= val2;                    /* x = y - x = 4 -(/) 1 = 3 */ 
		
		
		 /*val1 ^= val2 ^= val1 ^= val2;    
		
		/*val1 += val1 - val2;
		val2 = (byte)(val1 + val2);
		val1 -= val2 -val1 ;*/
		
		System.out.println("Byte" + "  " + val1);
		System.out.println("Float" + " " + val2);
		
	}
}
