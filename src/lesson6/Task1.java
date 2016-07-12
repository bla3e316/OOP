package lesson6;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
	public static void main(String[]args) {
		//ArrayList<String> list = new ArrayList<String>() // проверка что все строки Generic
		//ArrayList list<int> = new ArrayList<int>;
		//ArrayList list<Integer> = new ArrayList<Integer>;

		byte b = 10;
		Byte b1 = 10;//обертка byte
		Byte b2 = null;
		
		short s = 10;
		Short s1 = 10;
		
		int i =10;
		Integer i1 =10;
		Integer i2 = new Integer(10);
		Integer i3 = Integer.valueOf(10);
		
		char ch ='a';
		Character  ch1 = 'a';
		
		
		
		ArrayList list = new ArrayList(); //в списке не указан размер в отличии от массива
		System.out.println(list.size());
		ArrayList list2 = new ArrayList(100); //в списке не указан размер в отличии от массива
		System.out.println(list2.size());
		
		list.add("Hello");
		list.add("World");
		list.add("Java");
		list.add(999);
		list.add(false);
		list.add('A');

		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2)); //можно только прочитать значение из списка но не записать
		list.set(3, "CoOL"); //заменяет значение
		System.out.println(list);
		list.add(2, "val"); //вставка со сдвигом вправо индекс+1
		System.out.println(list);
		
		list.remove(2);//удаление 2го из списка
		System.out.println(list);
		
		//list.clear();
		//System.out.println(list);

		System.out.println(list.contains("Hello"));
		System.out.println(list);

		System.out.println(list.indexOf("Java"));
		
		
		String val = (String)list.get(2);
		System.out.println(val);
		
		
		Integer [] arr = new Integer[0];
		arr = (Integer[]) list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		//list.toArray(args);
		
		

		
		



		

		
	}	
	
}
