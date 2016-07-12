package lesson4;

public class Task1 {
	
	public static void main(String[] args) {
		
		//int [] array = {4, 2, 5, 1, 6};	//литерал типа массив
		int [] array = new int[10];
	
		//System.out.println(array[0]);
		//System.out.println(array[4]);	// встроенно в ждк (оут оф боундс - вне размерности массива(элемента нет под таким индексом))
		
		int val = array[4];
		array[0] = 999;
	//	System.out.println(array[0]);
	//	System.out.println(array+ "");
	//	System.out.println("");

		//записать массив случайными значениями
		
		int idx = 0;
		while (idx < array.length){
		
		int rnd = (int)( Math.random() * 100);
		array[idx] = rnd;
		idx++;
		}
		
		idx = 0;
		while(idx < array.length){   	//length -  хранит колличество элементов массива
		System.out.print(array[idx]+ " ");
		idx++;
		}
		
		System.out.println("");
		
		idx = 0;
		while(idx < array.length){
		if (array[idx] < 50){
		array[idx] = 0;}
		//System.out.print(array[idx]+ " "); //print вывод в стоку   println- в  столбец
		idx++;
		}
		
		idx = 0;
		while(idx < array.length){   	//length -  хранит колличество элементов массива
		System.out.print(array[idx]+ " ");
		idx++;
		}
		
	}
	
}
