package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class Task2 {
	
	public static void main(String[]args) {
		
		
		int []result = indexof ("Hello Hello","Hello");
		System.out.println(Arrays.toString(result));
		
	}
	
	public static int[] indexof(String str, String sub) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; (i = str.indexOf(sub, i)) != -1; i+=sub.length()){
			System.out.println(i);
			list.add(i);
		}
		int [] array = new int[list.size()];
		for( int i = 0; i < array.length ; i++){
			array[i] = list.get(i);
		}		
		return array;
	}


}
