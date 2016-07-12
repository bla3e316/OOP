package lesson5;

public class Task2 {

	public static void main(String[]args) {
		String str = "Hello World"; 		//так делать
		String str3 = String.valueOf("Hello World"); //пул строк(отдельный)	

		
		String str1 = new String("Hello World"); //так НЕ делать
		
		String str2 = str1;
				
		System.out.println(str == str1);//сравниваются ссылки (адреса в памяти)
	
		System.out.println(str1 == str2);

		System.out.println(str3 == str1); //идентичность

		System.out.println(str3.equals (str1)); //эквивалентность
		
		

	}

}
