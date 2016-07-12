package lesson5;

public class Task3 {
	public static void main(String[] args){
		int[]array = new int[10];
		int[]array2 = array; 	//один обьект две ссылки
		array[0] = 999;
		System.out.println(array2[0]);
	}

}
