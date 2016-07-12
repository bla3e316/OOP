package lesson2;

public class Task7 {
	
	public static void main(String []args){   /*Конструкция условий*/
		
		int age = 17;
											/* ; означает конец инструкции,не будет связывать последующий вывод*/
		if(age >= 18){                       /*{ } если условие не выполняется то то что в скобках не выводится   */
			
			System.out.println("ты совершеннолетний");
		} else {
		
		System.out.println("ты  НЕ совершеннолетний ");
			}
		
		
		System.out.println("Конец опроса");

		
		}						
		
	}


