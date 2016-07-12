package lesson5;


public class Task1 {
	public static void main(String[]args) {
		int val = 10;
		String str = "   Hello World   "; 		//так делать
		
		String str1 = new String("Hello World"); //так НЕ делать
		System.out.println(str1);

		String str2 = String.valueOf(val);		//и так делать
		
		System.out.println(str1 +" "+ str2);
		System.out.println(str.length());
		System.out.println(str2.length());
		
		System.out.println(str.charAt(0));
		
		String sub = str.substring(3);		// с 3го и до конца 
		System.out.println(sub);
		
		String sub1 = str.substring(3,7);	// с 3го по 7 (не включая)
		System.out.println(sub1);
		
		String res = str.trim();			//трим убирает пробелы 
		System.out.println(res);
		
		String conc = str.concat("  fooo");	//склеить строку
		System.out.println(conc);
		
		String toUpper = str.toUpperCase(); //в верхний регистр (loLowerCase)
		System.out.println(toUpper);
		
		System.out.println(str1.contains("Hello"));//совпадает ли целиком
		
		System.out.println(str1.indexOf("world"));//индекс в котором начинается совпадение
		System.out.println(str1.indexOf("World"));//индекс в котором начинается совпадение

		System.out.println(str1.indexOf('W')); // один чар ' ' для одного символа

		System.out.println(str1.lastIndexOf('W')); //ищет с конца   метод последнего вхождения
		
		//str1.indexOf(, fromIndex) //искать начиная с индекса
		
		//public static void indexof(String str , String sub){
			//вывести индексы всех вхождений(если их много)(метод который INdex oF,fromIndex)
		//}
		
		System.out.println(str == str1);
	
	}

}
